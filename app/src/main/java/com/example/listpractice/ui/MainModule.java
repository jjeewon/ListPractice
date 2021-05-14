package com.example.listpractice.ui;

import android.content.Context;

import androidx.databinding.DataBindingUtil;

import com.example.listpractice.R;
import com.example.listpractice.databinding.ActivityMainBinding;
import com.example.listpractice.di.ActivityContext;
import com.example.listpractice.di.ActivityScope;
import com.example.listpractice.di.FragmentScope;
import com.example.listpractice.ui.post.PostFragment;
import com.example.listpractice.ui.post.PostModule;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainModule {
    @Provides
    @ActivityScope
    static ActivityMainBinding provideBinding(MainActivity activity) {
        return DataBindingUtil.setContentView(activity, R.layout.activity_main);
    }

    @Provides
    @ActivityContext
    static Context provideContext(MainActivity activity) {
        return activity;
    }

    /**
     * 서브 컴포넌트 정의
     */
    @FragmentScope
    @ContributesAndroidInjector(modules = PostModule.class)
    abstract PostFragment getPostFragment();
}
