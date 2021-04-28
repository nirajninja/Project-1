package com.example.navigation_drawer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigation_drawer.Quiz.question_activity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
       // getActionBar()?.setDisplayHomeAsUpEnabled(true);

        intent.putExtra("samplename", "abd")

        btn1.setOnClickListener {

            val data:Int=1

            val intent= Intent(this,
                question_activity::class.java)
            intent.putExtra("ExtraData",data)
            startActivity(intent)

        }
    }






}