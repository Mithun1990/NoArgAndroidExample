package com.naim.androiddataclassnoargexample

import android.os.Build
import android.os.Bundle
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.naim.androiddataclassnoargexample.model.ThirdModel
import com.naim.androiddataclassnoargexample.viewmodel.MainViewModel


class MainActivity : AppCompatActivity() {
    val mainViewModel: MainViewModel by viewModels()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Values ${mainViewModel.firstModel.toString()}")
        println("Values ${mainViewModel.secondModel.toString()}")
        println("Values ${mainViewModel.thirdModel.toString()}")
    }
}