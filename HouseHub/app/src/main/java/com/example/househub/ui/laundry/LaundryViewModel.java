package com.example.househub.ui.laundry;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class LaundryViewModel extends ViewModel {

        private MutableLiveData<String> mText;

        public LaundryViewModel() {
            mText = new MutableLiveData<>();
            mText.setValue("This is home fragment");
        }

        public LiveData<String> getText() {
            return mText;
        }
}
