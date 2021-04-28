package com.example.navigation_drawer


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
/*

home fragment se activty 2 par navigate krna h,phir usme, bottom nav daalna h, phir baaki ka kaam toh easy hi h

https://www.youtube.com/watch?v=bqC0y_VLq5Q
*/

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle=ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close)
        toggle.isDrawerIndicatorEnabled=true
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        nav_menu.setNavigationItemSelectedListener (this)
        setToolbarTitle("Home")
        val fragment=supportFragmentManager.beginTransaction()
        fragment.replace(R.id.fragment_container,home()).commit()
    }

    private fun setToolbarTitle(s: String) {
    supportActionBar?.title=s
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)
        if(item.itemId==R.id.home)
        {
            setToolbarTitle("Home")
            val fragment=supportFragmentManager.beginTransaction()
            fragment.replace(R.id.fragment_container,home()).commit()
        }
        if(item.itemId==R.id.About)
        {
            setToolbarTitle("About")
            val fragment=supportFragmentManager.beginTransaction()
            fragment.replace(R.id.fragment_container,About()).commit()
        }
        if(item.itemId==R.id.questions)
        {
            setToolbarTitle("About")
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }

        if(item.itemId==R.id.quiz)
        {

            val intent=Intent(this,QuizActivity::class.java)
            startActivity(intent)

        }



        return true
    }
}