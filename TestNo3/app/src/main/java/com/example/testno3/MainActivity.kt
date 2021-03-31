package com.example.testno3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        A1.setOnClickListener{
            val toast = Toast.makeText(this, "Incorrect !", Toast.LENGTH_LONG)

            toast.show()

        }
        B1.setOnClickListener{
            val toast = Toast.makeText(this, "Incorrect !", Toast.LENGTH_LONG)

            toast.show()

        }
        C1.setOnClickListener{
            val toast = Toast.makeText(this, "Correct !", Toast.LENGTH_LONG)

            toast.show()

        }
        D1.setOnClickListener{
            val toast = Toast.makeText(this, "Incorrect !", Toast.LENGTH_LONG)

            toast.show()

        }
        Next1.setOnClickListener{
            Intent = new Intent(MainActivity.this, MainActivity.class);
        }


    }
}