package com.example.listpractice.di;

import com.example.listpractice.data.CommentService;
import com.example.listpractice.data.PostService;
import com.example.listpractice.data.UserService;
import com.example.listpractice.data.entity.Comment;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import retrofit2.Retrofit;

@Module
public class RetrofitModule {
    @Provides
    @Reusable
    PostService providePostService(Retrofit retrofit){
        return retrofit.create(PostService.class);
    }

    @Provides
    @Reusable
    UserService provideUserService(Retrofit retrofit){
        return retrofit.create(UserService.class);
    }

    @Provides
    @Reusable
    CommentService provideCommentService(Retrofit retrofit){
        return retrofit.create(CommentService.class);
    }
}
