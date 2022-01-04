package com.example.fundforchange.activities.user.event;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CreateEventViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public CreateEventViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Create event fragment");
    }
    public LiveData<String> getText() {
        return mText;
    }

}
