package com.example.myapplication;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainController {

    private MainActivity activity;

    public MainController(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    public void onStart(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/Otherside2710/Application_Mobile_4A/master/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        RestAPILinux restAPILinux = retrofit.create(RestAPILinux.class);

        Call<RestAPILinuxResponse> call = restAPILinux.getListLinux();
        call.enqueue(new Callback<RestAPILinuxResponse>() {
            @Override
            public void onResponse(Call<RestAPILinuxResponse> call, Response<RestAPILinuxResponse> response) {
                if (response.isSuccessful()) {
                    RestAPILinuxResponse restAPILinuxResponse = response.body();
                    List<Linux> listLinux = restAPILinuxResponse.getResults();
//                    activity.showList(listLinux);
                } else {
                    System.out.println(response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<RestAPILinuxResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }
}
