package com.github.doubledeath.android.garbage.ui.activity.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.github.doubledeath.android.garbage.R
import com.github.doubledeath.android.garbage.databinding.ActivityMainBinding
import com.github.doubledeath.android.mvvm.impl.MvvmActivity

class MainActivity : MvvmActivity<MainActivityView, MainActivityViewModel>(), MainActivityView {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = getViewModel()
    }

}
