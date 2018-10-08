package com.example.sys9.retrofit;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("Status")
    private String status;

    public String getStatus() {
        return status;
    }

    public String getUserId() {
        return userId;
    }
    @SerializedName("UserId")
    private String userId;
}
