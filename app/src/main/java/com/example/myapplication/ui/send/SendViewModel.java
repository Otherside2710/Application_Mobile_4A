package com.example.myapplication.ui.send;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SendViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SendViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("fragment pour envoyer des choses \" Coming Soon\" ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}