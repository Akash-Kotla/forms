package com.example.forms_spinner.Apiinterface


import com.example.forms_spinner.model.PostModels
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface getallpackinterface {

    @Headers("ocp-apim-subscription-key:c442b3d7489942058d2a83e7a023b731")

    @GET("content/getcourselevel/CMA")

    fun getallPcakages(@Query("packages") all_packs:String):Call<PostModels>



}