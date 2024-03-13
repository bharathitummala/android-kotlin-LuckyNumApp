package com.example.luckynumber

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import kotlin.random.Random

class LuckyNumberActivity : ComponentActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)
       // val resTxt : TextView = findViewById(R.id.resTxt)
        val luckyTxt:TextView =findViewById(R.id.LuckyTxtNum)
        val shareBtn : Button = findViewById(R.id.shareBtn)
       val user_name = recveUserName()
        val random_num = generateRandomNum()
        luckyTxt.setText(" "+random_num)

      shareBtn.setOnClickListener(){
          shareData(user_name, random_num)
      }

    }
    fun recveUserName():String{
        val bundle:Bundle? = intent.extras
        val usrName = bundle?.get("name").toString()
        return usrName

    }
    fun generateRandomNum():Int{
        val random = Random.nextInt(1000)
        return random
    }
    fun shareData(username: String, num: Int){
        val i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT, "$username is lucky today")
        i.putExtra(Intent.EXTRA_TEXT, "Lucky number is $num")
        startActivity(i)
    }
}