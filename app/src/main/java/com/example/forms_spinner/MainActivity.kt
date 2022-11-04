package com.example.forms_spinner

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.forms_spinner.viewModel.ViewModelFactory
import com.example.forms_spinner.viewModel.cmaViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    lateinit var CMAViewModel: cmaViewModel
    lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn)


       CMAViewModel  = ViewModelProvider(this@MainActivity,
        ViewModelFactory()
        )[cmaViewModel::class.java]

        button.setOnClickListener {
            CMAViewModel.getuserlist(pack = String())


            CMAViewModel.cmaLiveData.observe(this){
                textview1.text = it.data[0].courseLevel.toString()
            }
        }














    }
}