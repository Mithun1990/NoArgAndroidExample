package com.naim.androiddataclassnoargexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.naim.androiddataclassnoargexample.model.FirstModel
import com.naim.androiddataclassnoargexample.model.SecondModel
import com.naim.androiddataclassnoargexample.model.ThirdModel
import kotlin.reflect.full.createInstance

class MainViewModel : ViewModel() {
    private var _firstModel: MutableLiveData<FirstModel> =
        MutableLiveData<FirstModel>(FirstModel(id = 1, title = "Title", subtitle = "Sub Title"))
    val firstModel: LiveData<FirstModel>
        get() = _firstModel

    private var _secondModel: MutableLiveData<SecondModel> =
        MutableLiveData<SecondModel>(SecondModel())
    val secondModel: LiveData<SecondModel>
        get() = _secondModel

    private var _thirdModel: MutableLiveData<ThirdModel> =
        MutableLiveData(ThirdModel::class.createInstance())
    val thirdModel: LiveData<SecondModel>
        get() = thirdModel
}