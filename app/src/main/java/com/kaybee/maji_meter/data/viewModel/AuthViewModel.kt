package com.kaybee.maji_meter.data.viewModel

import androidx.lifecycle.ViewModel
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.kaybee.maji_meter.data.model.AuthRepository

class AuthViewModel: ViewModel() {

    private val  authRepo = AuthRepository()

    var email: String ? = null
    var password: String? = null

    // Creating a firebase auth repository
    fun signIn(email: String, password: String): Task<AuthResult>{
        return authRepo.signIn(email,password)
    }

    fun signOut(){
        authRepo.signOut()
    }
}