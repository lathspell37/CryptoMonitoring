package com.example.cryptomonitoring.service;

import com.example.cryptomonitoring.model.CryptoModel;

import java.util.List;


import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("prices?key=8f83862f001a5d891d90c57801320798")
    Observable<List<CryptoModel>> getData();

}
