package com.example.retrofitimplementation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

//public interface RetrofitAPI {
//
//    @GET("posts")
//    Call<List<Post>> getPosts();
//}

public interface RetrofitAPI {
    @GET
    Call<Post> getMessage(@Url String url);
}
