package com.example.themeatman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MyClass {
    companion object {
        const val SomeProperty = "20dp"
    }
}

class MainActivity : AppCompatActivity() {

    var shipX : Int = 0
    var shipY : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun moveL(view: View) {
        shipX =  shipX - 10
        println(shipX)


    }




}