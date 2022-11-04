package com.example.forms_spinner.model

import com.google.gson.annotations.SerializedName



//     class PackageResponse (
//
//        @SerializedName("status"  ) var status  : Int?            = null,
//        @SerializedName("data"    ) var data    : ArrayList<ContactsContract.RawContacts.Data> = arrayListOf(),
//        @SerializedName("message" ) var message : String?         = null
//
//    )


//     class Data (
//
//        @SerializedName("_id"                ) var Id                : String?  = null,
//        @SerializedName("status"             ) var status            : String?  = null,
//        @SerializedName("title"              ) var title             : String?  = null,
//        @SerializedName("no_of_days"         ) var noOfDays          : String?  = null,
//        @SerializedName("credits_per_month"  ) var creditsPerMonth   : String?  = null,
//        @SerializedName("total_credits"      ) var totalCredits      : String?  = null,
//        @SerializedName("amount"             ) var amount            : String?  = null,
//        @SerializedName("membership_package" ) var membershipPackage : Boolean? = null,
//        @SerializedName("tax"                ) var tax               : String?  = null,
//        @SerializedName("image"              ) var image             : String?  = null,
//        @SerializedName("main_course_id"     ) var mainCourseId      : String?  = null,
//        @SerializedName("__v"                ) var _v                : Int?     = null,
//        @SerializedName("promocode_status"   ) var promocodeStatus   : String?  = null,
//        @SerializedName("package_code"       ) var packageCode       : String?  = null,
//        @SerializedName("isCourse"           ) var isCourse          : String?  = null,
//        @SerializedName("isDistributer"      ) var isDistributer     : String?  = null,
//        @SerializedName("isMembership"       ) var isMembership      : String?  = null,
//        @SerializedName("package_type"       ) var packageType       : String?  = null,
//        @SerializedName("g_end_color"        ) var gEndColor         : String?  = null,
//        @SerializedName("g_start_color"      ) var gStartColor       : String?  = null,
//        @SerializedName("admin_status"       ) var adminStatus       : String?  = null
//
//    )
 class PostModels {

    @SerializedName("data") var data   : ArrayList<Data> = arrayListOf()
    @SerializedName("status") var status : Int?            = null



    class Data (

        @SerializedName("_id") var Id            : String? = null,
        @SerializedName("course_level") var courseLevel   : String? = null,
        @SerializedName("course_level_id") var courseLevelId : String? = null,
        @SerializedName("icon") var icon          : String? = null
    )

 }