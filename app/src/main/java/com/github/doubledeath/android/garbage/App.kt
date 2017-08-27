package com.github.doubledeath.android.garbage

import android.app.Application
import com.github.doubledeath.android.garbage.mvvm.ViewModelFactory
import com.github.doubledeath.android.mvvm.MvvmFacade

/**
 * Created by doubledeath on 8/27/17.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        MvvmFacade.instance.setViewModelFactory(ViewModelFactory())
    }

}