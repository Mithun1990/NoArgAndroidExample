package com.naim.androiddataclassnoargexample.model

data class SecondModel(val id: Int, val title: String, val subtitle: String) {
    constructor() : this(-1, "Title", "Sub Title")
}