package com.abelaash.abelaashpassdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var  checkboxresult = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        checkBox.setOnCheckedChangeListener { button, b ->
            if (checkBox.isChecked)
                checkboxresult = true
            else
                checkboxresult = false
        }
    }

    fun onSaveButtonClick(view: View) {

        val name = nameET.text.toString()
        val mark = markET.text.toString().toInt()
        val average = averageET.text.toString().toDouble()

        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("Name", name)
        intent.putExtra("Mark", mark)
        intent.putExtra("Average", average)
        intent.putExtra("Coop", checkboxresult)

        startActivity(intent)
    }
}
