package com.example.myapplication.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("fragment pour partager des choses \" Coming Soon\" ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}