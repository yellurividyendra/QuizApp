package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      val btnstart : Button = findViewById(R.id.btnstart)
        val etName : EditText = findViewById(R.id.etname)
       btnstart.setOnClickListener {

           if(etName.text.isEmpty()){
               Toast.makeText(this,
                   "Please enter your name",Toast.LENGTH_LONG).show()
           } else {
               val intent  = Intent(this, QuizQuestionsActivity::class.java)
               intent.putExtra(Constants.USER_NAME, etName.text.toString())
               startActivity(intent)
               finish()
           }
       }


    }
}