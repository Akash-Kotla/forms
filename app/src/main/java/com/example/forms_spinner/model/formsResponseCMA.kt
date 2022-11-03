package com.example.forms_spinner.model

import com.google.gson.annotations.SerializedName




class formsResponseCMA {

    @SerializedName("data")
        var data :
        ArrayList<Data> = arrayListOf()
        @SerializedName("status")
        var status : Int?= null

    data class Data (
        @SerializedName("_id")
        var Id: String? = null,
        @SerializedName("course_level")
        var courseLevel : String? = null,
        @SerializedName("course_level_id")
        var courseLevelId : String? = null,
        @SerializedName("icon")
        var icon : String? = null
    )

}