package com.anurag.upi_client.retrofitClient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    static String BASE_URL = "";
    private static Retrofit client;
    public static Retrofit getRetrofitInstance() {
        if (client == null) {
            client = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return client;
    }
}
