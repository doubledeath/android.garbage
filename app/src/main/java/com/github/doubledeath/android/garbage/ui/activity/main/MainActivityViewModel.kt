package com.github.doubledeath.android.garbage.ui.activity.main

import android.databinding.Bindable
import android.view.View
import com.github.doubledeath.android.garbage.BR
import com.github.doubledeath.android.mvvm.MvvmViewModel
import java.util.*

/**
 * Created by doubledeath on 8/27/17.
 */
class MainActivityViewModel(tag: String) : MvvmViewModel<MainActivityView>(tag) {

    var text: String = ""
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.text)
        }

    fun onClickButton(view: View) {
        text = UUID.randomUUID().toString()
    }

}