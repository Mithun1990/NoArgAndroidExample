package com.naim.androiddataclassnoargexample

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.naim.androiddataclassnoargexample.model.ThirdModel
import com.naim.androiddataclassnoargexample.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val thirdModel = ThirdModel::class.java.newInstance()
        println("Values ${thirdModel.id} ${thirdModel.title}")
    }
}