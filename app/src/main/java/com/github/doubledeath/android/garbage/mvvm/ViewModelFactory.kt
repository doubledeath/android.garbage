package com.github.doubledeath.android.garbage.mvvm

import com.github.doubledeath.android.garbage.ui.activity.main.MainActivity
import com.github.doubledeath.android.garbage.ui.activity.main.MainActivityViewModel
import com.github.doubledeath.android.mvvm.MvvmViewModel
import com.github.doubledeath.android.mvvm.MvvmViewModelFactory
import com.github.doubledeath.android.mvvm.getTagForActivity

/**
 * Created by doubledeath on 8/27/17.
 */
class ViewModelFactory : MvvmViewModelFactory {

    override fun createViewModel(viewModelTag: String): MvvmViewModel<*> {
        if (viewModelTag == MainActivity::class.getTagForActivity()) {
            return MainActivityViewModel(viewModelTag)
        }

        TODO("not implemented")
    }

}