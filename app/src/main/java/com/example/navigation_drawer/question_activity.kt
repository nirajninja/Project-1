package com.example.navigation_drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.navigation_drawer.inside_fragment.fragment1
import com.example.navigation_drawer.inside_fragment.fragment2
import com.example.navigation_drawer.inside_fragment.fragment3
import kotlinx.android.synthetic.main.activity_question_activity.*

class question_activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        val data=intent.getIntExtra("ExtraData",0)

   /* if(data==1)
    {
        Toast.makeText(this,"hello bitches",Toast.LENGTH_SHORT).show()
    }*/
//        Log.d("TAG"," the string is $String")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_activity)

        val firstfragment= fragment1()
        val secondFragment= fragment2()
        val thirdFragment= fragment3()

        setcurrentfragment(firstfragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miHome->setcurrentfragment(firstfragment)
                R.id.miProfile->setcurrentfragment(secondFragment)
                R.id.mi_message->setcurrentfragment(thirdFragment)
            }
            true
        }
    }
    private fun setcurrentfragment(fragment: Fragment)
    {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment,fragment)
            commit()
        }
    }




}