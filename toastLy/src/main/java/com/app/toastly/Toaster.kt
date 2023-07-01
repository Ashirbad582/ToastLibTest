package com.app.toastly

import android.content.Context
import android.widget.Toast

class Toaster {
     fun showToast(context: Context, message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}