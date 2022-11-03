package com.example.forms_spinner

import android.annotation.SuppressLint

class Category {

    private var id: String? = null
    private var course_level: String? = null
    private var course_level_id: String? = null
    private var icon: String? = null


    @SuppressLint("NotConstructor")
    fun Category(id: String?, course_level : String?, course_level_id: String?, icon: String?){
       this.id = id
       this.course_level = course_level
       this.course_level_id = course_level_id
       this.icon = icon
   }

   fun  getid(): String? {
       return id
   }

   fun getcourse_level(): String?{
       return course_level
   }

   fun getcourse_level_id(): String? {
       return course_level_id
   }

    fun geticon(): String? {
       return icon
       }

    }






