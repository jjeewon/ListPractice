package com.example.listpractice.ui.post;

import androidx.annotation.NonNull;

import com.example.listpractice.data.entity.Post;

import java.util.EventListener;

public class PostItem {
    @NonNull
    private final Post post;
    @NonNull
    private final EventListener eventListener;

    public PostItem(@NonNull Post post, EventListener eventListener){
        this.post = post;
        this.eventListener = eventListener;
    }

    @NonNull
    public EventListener getEventListener(){
        return eventListener;
    }

    public interface EventListener{
        void onPostClick(PostItem postItem);
    }

    @NonNull
    public Post getPost(){
        return this.post;
    }

    public String getTitle(){
        return post.getTitle();
    }
}
