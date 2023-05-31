package com.anurag.upi_client.api.APIInterfaces;

import com.anurag.upi_client.api.Model.GETStatusModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Status {
    @GET("/status")
    Call<GETStatusModel> getStatus();
}
