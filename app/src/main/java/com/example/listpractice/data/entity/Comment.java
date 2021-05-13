package com.example.listpractice.data.entity;

public class Comment {
    private long postId;
    private long id;
    private String name;
    private String email;
    private String body;

    public long getId() {
        return id;
    }

    public long getPostId() {
        return postId;
    }

    public String getBody() {
        return body;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
