package com.example.forms_spinner.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object constant {

    const val BASE_URL = "https://nl-ns-apim-ds.azure-api.net/dev-darwin-lc/v1/content/"

    fun buildApi(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()






    }
}