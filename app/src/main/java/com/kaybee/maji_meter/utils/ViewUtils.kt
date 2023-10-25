package com.kaybee.maji_meter.utils

import android.content.Context
import android.widget.Toast

class ViewUtils {

    object  Extensions{
        fun Context.toast(message: String){
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}