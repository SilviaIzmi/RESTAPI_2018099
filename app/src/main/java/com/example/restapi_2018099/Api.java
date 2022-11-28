package com.example.restapi_2018099;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://kodepos-2d475.firebaseio.com/";
    @GET("k69.json?print=pretty")
    Call<List<Results>> getkodepos();
}

