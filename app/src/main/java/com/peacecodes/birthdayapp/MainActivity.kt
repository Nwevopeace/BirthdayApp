package com.peacecodes.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.Constraints

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.btnClick)
        btnClick.setOnClickListener() {displayImage(it)}
    }

    fun displayImage(view: View) {
        val image = findViewById<ImageView>(R.id.image)
        val mainLayout = findViewById<ConstraintLayout>(R.id.mainLayout)

        image.visibility = View.VISIBLE

        mainLayout.setBackgroundColor(resources.getColor(R.color.background))
    }
}