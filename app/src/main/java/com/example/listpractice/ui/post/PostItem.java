package com.example.listpractice.ui.post;

import androidx.annotation.NonNull;

import com.example.listpractice.data.entity.Post;

public class PostItem {
    @NonNull
    private final Post post;
    public PostItem(@NonNull Post post){
        this.post = post;
    }

    @NonNull
    public Post getPost(){
        return this.post;
    }

    public String getTitle(){
        return post.getTitle();
    }
}
