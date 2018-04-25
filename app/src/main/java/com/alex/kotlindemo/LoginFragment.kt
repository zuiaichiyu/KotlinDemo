package com.alex.kotlindemo

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by alex on 18-2-26.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.login, container, false)

        testahha(context,1)
        return view
    }


    fun testahha(a: Context,b: Int ){

    }
}