package com.example.listpractice.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.listpractice.ui.post.PostViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

// ViewModel과 관련된 내용을 오브젝트 그래프로 관리
//ViewModel과 관련된 내용을 오브젝트 그래프로 관리
@Module
public abstract class ViewModelModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(AppViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(PostViewModel.class)
    abstract ViewModel bindsPostViewModel(PostViewModel viewModel);

}