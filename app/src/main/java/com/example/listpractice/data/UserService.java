package com.example.listpractice.data;

import com.example.listpractice.data.entity.User;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {
    @GET("/users/{userId}")
    Single<User> getUser(@Path("userId") long userId);
}
