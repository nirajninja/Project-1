package com.example.navigation_drawer

import android.os.Bundle
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigation_drawer.inside_fragment.fragment1
import com.example.navigation_drawer.inside_fragment.fragment2
import com.example.navigation_drawer.inside_fragment.fragment3
import kotlinx.android.synthetic.main.fragment_home.*

class home : Fragment (R.layout.fragment_home) {

/*
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_home, container, false)


    }*/
//

   /*
    private fun setcurrentfragment(fragment: Fragment)
    {

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment,fragment)
            commit()
        }
    }*/
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        val firstfragment=fragment1()
//        val secondFragment=fragment2()
//        val thirdFragment= fragment3()
//
//        setcurrentfragment(firstfragment)
//
//        bottomNavigationView.setOnNavigationItemSelectedListener {
//            when(it.itemId){
//                R.id.miHome->setcurrentfragment(firstfragment)
//                R.id.miProfile->setcurrentfragment(secondFragment)
//                R.id.mi_message->setcurrentfragment(thirdFragment)
//            }
//            true
//        }
//    }
//
//    private fun setcurrentfragment(fragment: Fragment)
//    {
//
//    }
//
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flfragment,fragment)
//            commit()
//        }







}