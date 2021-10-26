package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSubmit(view:View){
       val curYear = Calendar.getInstance().get(Calendar.YEAR)
        tv_age.text = "Age: 0"+(curYear - et_birthYear.text.toString().toInt())
    }
}