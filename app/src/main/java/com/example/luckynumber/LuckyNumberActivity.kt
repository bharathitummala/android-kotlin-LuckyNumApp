package com.example.luckynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class LuckyNumberActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)
        val resTxt : TextView = findViewById(R.id.resTxt)
        val luckyTxt:TextView =findViewById(R.id.LuckyTxtNum)
        val shareBtn : Button = findViewById(R.id.shareBtn)
       val user_name = recveUserName()
        Toast.makeText(this, "Hello "+user_name, Toast.LENGTH_LONG).show()
    }
    fun recveUserName():String{
        val bundle:Bundle? = intent.extras
        val usrName = bundle?.get("name").toString()
        return usrName
    }
}