package com.example.noknok.ui.date_catagory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DateCatagoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DateCatagoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}