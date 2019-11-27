package com.example.retrofitjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.retrofitjava.Adapter.ItemDataAdapter;
import com.example.retrofitjava.Model.Result;
import com.example.retrofitjava.Model.ResultItem;
import com.example.retrofitjava.Retrofit.ApiClient;
import com.example.retrofitjava.Retrofit.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvData;
    private ApiInterface apiInterface;
    private ItemDataAdapter itemDataAdapter;
    private ArrayList<ResultItem> resultItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvData = findViewById(R.id.rvData);
        resultItems = new ArrayList<>();
        itemDataAdapter = new ItemDataAdapter(this,resultItems);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvData.setLayoutManager(linearLayoutManager);
        rvData.setAdapter(itemDataAdapter);
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        final Call<Result> resultCall = apiInterface.getData(2);
        resultCall.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                  Result result = response.body();
                  resultItems = result.getData();
                 itemDataAdapter = new ItemDataAdapter(MainActivity.this,resultItems);
                  rvData.setAdapter(itemDataAdapter);
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

            }
        });


    }
}
