package com.kaybee.maji_meter.data.model

import android.widget.Toast
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth

class AuthRepository {

    private val auth = FirebaseAuth.getInstance()

    var  authState: String?=null

    fun signIn(email: String, password:String): Task<AuthResult> {
        return auth.signInWithEmailAndPassword(email, password)
    }

    fun signOut(){
        auth.signOut()
    }
}