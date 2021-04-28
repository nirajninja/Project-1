package com.example.navigation_drawer.Quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.navigation_drawer.ArrayEasy
import com.example.navigation_drawer.ArrayHard
import com.example.navigation_drawer.ArrayMedium
import com.example.navigation_drawer.R
import com.example.navigation_drawer.inside_fragment.fragment1
import com.example.navigation_drawer.inside_fragment.fragment2
import com.example.navigation_drawer.inside_fragment.fragment3
import kotlinx.android.synthetic.main.activity_question_activity.*

class question_activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        val data=intent.getIntExtra("ExtraData",0)

        val intent= Intent(this,fragment1::class.java)
        intent.putExtra("daa",data)


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
        firstfragment.list2= ArrayEasy
        secondFragment.mediumList= ArrayMedium
        thirdFragment.HardList= ArrayHard

        setcurrentfragment(firstfragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miEasy ->setcurrentfragment(firstfragment)
                R.id.miMedium ->setcurrentfragment(secondFragment)
                R.id.mi_Hard ->setcurrentfragment(thirdFragment)
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