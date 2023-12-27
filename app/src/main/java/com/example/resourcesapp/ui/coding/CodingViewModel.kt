package com.example.resourcesapp.ui.coding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CodingViewModel : ViewModel() {
    private val mText: MutableLiveData<String>

    init {
        mText = MutableLiveData()
        mText.value = "This is slideshow fragment"
    }

    val text: LiveData<String>
        get() = mText
}