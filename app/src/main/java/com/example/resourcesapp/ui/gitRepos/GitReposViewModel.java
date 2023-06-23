package com.example.resourcesapp.ui.gitRepos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GitReposViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GitReposViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}