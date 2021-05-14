package com.example.listpractice.ui;

import android.content.Context;

import androidx.databinding.DataBindingUtil;

import com.example.listpractice.R;
import com.example.listpractice.databinding.ActivityMainBinding;
import com.example.listpractice.di.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class MainModule {
    @Provides
    @ActivityScope
    static ActivityMainBinding provideBinding(MainActivity activity){
        return DataBindingUtil.setContentView(activity, R.layout.activity_main);
    }

    @Provides
    @ActivityScope
    static Context provideContext(MainActivity activity){
        return activity;
    }
}
