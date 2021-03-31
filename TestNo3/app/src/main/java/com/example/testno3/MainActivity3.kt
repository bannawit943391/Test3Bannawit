package com.example.testno3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.acticity_main3.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        A3.setOnClickListener{
            val toast = Toast.makeText(this, "Incorrect !", Toast.LENGTH_LONG)

            toast.show()

        }
        B3.setOnClickListener{
            val toast = Toast.makeText(this, "Incorrect !", Toast.LENGTH_LONG)

            toast.show()

        }
        C3.setOnClickListener{
            val toast = Toast.makeText(this, "Incorrect !", Toast.LENGTH_LONG)

            toast.show()

        }
        D3.setOnClickListener{
            val toast = Toast.makeText(this, "Correct !", Toast.LENGTH_LONG)

            toast.show()

        }


    }
}