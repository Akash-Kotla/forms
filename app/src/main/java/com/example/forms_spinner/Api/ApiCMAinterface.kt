package com.example.forms_spinner.Api

import com.example.forms_spinner.model.formsResponseCMA
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers



interface ApiCMAinterface{

    @Headers("ocp-apim-subscription-key: c442b3d7489942058d2a83e7a023b731")

    @GET("getcourselevel/CMA")
    fun getCMA(): Call<List<formsResponseCMA?>?>?

    @GET("content/getcourselevel/CS")
    fun getCA():Call<List<formsResponseCMA?>?>?


}
