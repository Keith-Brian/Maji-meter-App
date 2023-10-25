package com.kaybee.maji_meter.ui.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.google.firebase.auth.FirebaseAuth
import com.kaybee.maji_meter.databinding.ActivityMainBinding
import com.kaybee.maji_meter.ui.authentication.LoginActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val firebaseAuth = FirebaseAuth.getInstance()
        val firebaseUser = firebaseAuth.currentUser

        Handler(Looper.getMainLooper()).postDelayed({

            if(firebaseUser == null){
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
            }else{
                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
                finish()
            }
        },3000)


    }
}