package com.alex.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by alex on 18-2-26.
 */
class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val loginFragment = LoginFragment()

        supportFragmentManager.beginTransaction().add(android.R.id.content, loginFragment, localClassName.javaClass.simpleName)
                .commit()
    }
}