package com.example.listpractice.ui.post;

import android.app.FragmentBreadCrumbs;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.example.listpractice.databinding.FragmentPostBinding;
import com.example.listpractice.di.AppViewModelFactory;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

/**
 * 게시 글 화면 구성하기
 * 멤버 인젝션을 위해 DaggerFragment 상속
 */
public class PostFragment extends DaggerFragment {

    /**
     * 오브젝트 그래프로부터 멤버 인젝션
     */
    @Inject
    FragmentPostBinding binding;
    @Inject
    AppViewModelFactory viewModelFactory;

    PostViewModel viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // ViewModel 객체 요청
        viewModel = new ViewModelProvider(this, viewModelFactory).get(PostViewModel.class);
        if(savedInstanceState == null){
            // 데이터 요청, 프래그먼트가 재생성되었을 떄는 요청하지 않는다.
            viewModel.loadPosts();
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState){
        return binding.getRoot();
    }


}
