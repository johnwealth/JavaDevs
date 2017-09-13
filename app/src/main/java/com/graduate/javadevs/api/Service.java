package com.graduate.javadevs.api;

import com.graduate.javadevs.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by user on 2017-09-10.
 */
public  interface Service {

    @GET("search/users?q=language:java+location:Lagos")
    Call<ItemResponse> getItems();
}
