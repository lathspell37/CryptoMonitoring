package com.example.cryptomonitoring.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {
    @SerializedName("currency")
    public String currency;
    @SerializedName("price")
    public String price;

}
