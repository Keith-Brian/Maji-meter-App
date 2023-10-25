package com.kaybee.maji_meter.ui.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.kaybee.maji_meter.R
import com.kaybee.maji_meter.data.viewModel.AuthViewModel
import com.kaybee.maji_meter.databinding.ActivityLoginBinding
import com.kaybee.maji_meter.ui.onboarding.Dashboard
import com.kaybee.maji_meter.utils.ViewUtils.Extensions.toast

class LoginActivity : AppCompatActivity() {

    private lateinit var loginBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        val authViewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        loginBinding.loginBtn.setOnClickListener {


            if(loginBinding.username.text.toString().isNotEmpty() || loginBinding.password.toString().isNotEmpty()){
            authViewModel.email = loginBinding.username.text.toString()
            authViewModel.password = loginBinding.password.text.toString()
            authViewModel.signIn(authViewModel.email!!, authViewModel.password!!)
                .addOnCompleteListener { task ->

                    if(task.isSuccessful){
                        toast("Authentication Successful!")
                        val intent = Intent(this, Dashboard::class.java)
                        startActivity(intent)
                        finish()

                    } else{
                        toast("Authentication Failed!")
                    } }
                } else {
                    toast("Fields Cannot Be Blank!")
                }}


    }

}