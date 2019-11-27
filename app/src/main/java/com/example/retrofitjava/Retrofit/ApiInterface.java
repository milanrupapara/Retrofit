package com.example.retrofitjava.Retrofit;

import com.example.retrofitjava.Model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("users")
    Call<Result> getData( @Query("page")int page);
}
