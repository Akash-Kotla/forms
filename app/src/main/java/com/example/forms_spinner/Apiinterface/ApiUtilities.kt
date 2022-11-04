package com.example.forms_spinner.Apiinterface

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiUtilities {

    const val BASE_URL = "https://nl-ns-apim-ds.azure-api.net/dev-darwin-lc/v1/"

    fun getInstance() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}