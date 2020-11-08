package com.abelaash.abelaashpassdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = getIntent()
        val name = intent.getStringExtra("Name")
        val mark = intent.getIntExtra("Mark", 0)
        val aver = intent.getDoubleExtra("Average", 0.00)
        val coop = intent.getBooleanExtra("coop", false)

        resultTv.text = "Collected info: \n\nName: "+name+"\nMark: "+mark+"\nAverage: "+aver+"\nCoop: "+coop
    }
}