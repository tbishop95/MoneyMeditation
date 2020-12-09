package com.example.moneymeditaion2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result2.*

class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result1)

        val totalQuestions = intent.getIntExtra(Constants2.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants2.CORRECT_ANSWERS, 0)

        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions"

        btn_finish.setOnClickListener(){
            startActivity(Intent(this, LessonsActivity::class.java))
        }
    }
}