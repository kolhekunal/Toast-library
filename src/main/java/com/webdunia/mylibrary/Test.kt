package com.webdunia.mylibrary

import android.content.Context
import android.widget.Toast

public class Test {

    fun printToast(context : Context, txtString : String){
        Toast.makeText(context,txtString, Toast.LENGTH_SHORT).show()
    }

}