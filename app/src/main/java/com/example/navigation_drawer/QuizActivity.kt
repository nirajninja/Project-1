package com.example.navigation_drawer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigation_drawer.Quiz.QuizQuestionActivity
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)


        quizBtn1.setOnClickListener {
            val intent= Intent(this,
                QuizQuestionActivity::class.java)
            startActivity(intent)


        }
    }
}