package com.example.resourcesapp.ui.gitRepos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GitReposViewModel : ViewModel() {
    private val mText: MutableLiveData<String>

    init {
        mText = MutableLiveData()
        mText.value = "This is gallery fragment"
    }

    val text: LiveData<String>
        get() = mText
}