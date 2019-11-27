package com.example.retrofitjava.Retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit;
    public static OkHttpClient okHttpClient;
    public static Retrofit getClient(){
        okHttpClient = new OkHttpClient();
        retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .callFactory(okHttpClient).baseUrl("https://reqres.in/api/").build();
        return retrofit;
    }
}
