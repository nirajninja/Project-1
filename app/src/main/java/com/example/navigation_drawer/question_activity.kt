package com.example.navigation_drawer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.navigation_drawer.inside_fragment.fragment1
import com.example.navigation_drawer.inside_fragment.fragment2
import com.example.navigation_drawer.inside_fragment.fragment3
import kotlinx.android.synthetic.main.activity_question_activity.*

class question_activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        val data=intent.getIntExtra("ExtraData",0)

        val intent= Intent(this,fragment1::class.java)
        intent.putExtra("daa",data)
        val firstfragment= fragment1()
        val secondFragment= fragment2()
        val thirdFragment= fragment3()


        if(data==1)
    {

        firstfragment.list2= ArrayEasy
        secondFragment.mediumList= ArrayMedium
        thirdFragment.HardList= ArrayHard

    }
        else if(data==2)
        {
            firstfragment.list2= sortingEasy
            secondFragment.mediumList= sortingMedium
            thirdFragment.HardList= sortingHard

        }
        else if(data==3)
        {
            firstfragment.list2= stacksEasy
            secondFragment.mediumList= stackMedium
            thirdFragment.HardList= stackHard

        }
//       Log.d("TAG"," the string is $String")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_activity)




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