package com.example.luckynumber

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.luckynumber.ui.theme.LuckyNumberTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1 :Button = findViewById(R.id.wishBtn)
    //    val welTxt: TextView = findViewById(R.id.welTxt)
        val etText : EditText = findViewById(R.id.etTxt)

        b1.setOnClickListener(){
            val userName = etText.text

            val i = Intent(this, LuckyNumberActivity::class.java)

            i.putExtra("name", userName)
            startActivity(i)
        }

    }
}