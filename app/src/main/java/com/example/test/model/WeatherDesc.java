package com.example.test.model;

import com.google.gson.annotations.SerializedName;

public class WeatherDesc {
    @SerializedName("description")
    private String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}

