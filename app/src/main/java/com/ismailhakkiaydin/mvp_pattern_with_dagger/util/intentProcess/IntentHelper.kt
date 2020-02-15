package com.ismailhakkiaydin.mvp_pattern_with_dagger.util.intentProcess

import android.content.Context
import android.content.Intent
import com.ismailhakkiaydin.mvp_pattern_with_dagger.main.MainActivity

class IntentHelper(private val context: Context) {

    fun intentToMainActivity(){
        context.startActivity(Intent(context, MainActivity::class.java))
    }

}