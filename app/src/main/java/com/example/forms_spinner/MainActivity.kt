package com.example.forms_spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.forms_spinner.Api.ApiCMAinterface


class MainActivity : AppCompatActivity() {

lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        spinner = findViewById(R.id.Package)
        spinner = findViewById(R.id.course)
        spinner = findViewById(R.id.courselevel)




    }
}