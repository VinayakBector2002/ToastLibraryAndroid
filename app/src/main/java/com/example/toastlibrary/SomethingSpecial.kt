package com.example.toastlibrary

import android.content.Context
import android.util.Log
import android.widget.Toast

object SomethingSpecial {
    fun show(C : Context, M : String){
        Toast.makeText(C,M,Toast.LENGTH_LONG).show()
    }
    fun Debugger (context : Context, message : String, tag : String){
        show(context,message)
        Log.d(tag,message)
    }
}