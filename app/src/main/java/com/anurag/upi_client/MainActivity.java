package com.anurag.upi_client;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anurag.upi_client.api.APIInterfaces.Status;
import com.anurag.upi_client.api.Model.GETStatusModel;
import com.anurag.upi_client.retrofitClient.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkStatus();
    }
public void checkStatus(){

    Status status = RetrofitClient.getRetrofitInstance().create(Status.class);
    Call <GETStatusModel> call = status.getStatus();

    call.enqueue(new Callback<GETStatusModel> (){

        public void onResponse(Call<GETStatusModel> call, Response<GETStatusModel> response){
            System.out.println(response);
        }

        @Override
        public void onFailure(Call<GETStatusModel> call, Throwable t) {
            throw new RuntimeException(t);
        }

    });
}

}