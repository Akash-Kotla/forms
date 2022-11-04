package com.example.forms_spinner.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.forms_spinner.Apiinterface.ApiUtilities
import com.example.forms_spinner.Apiinterface.getallpackinterface
import com.example.forms_spinner.model.PostModels

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AllPackRepository {


    //    declare
    var apiinterface:  getallpackinterface = ApiUtilities.getInstance().create(getallpackinterface::class.java)

    var packData: MutableLiveData<PostModels> = MutableLiveData<PostModels>()

    fun getPackageRespository(hearable_id:String): MutableLiveData<PostModels> {

        val call = apiinterface.getallPcakages(hearable_id)
        call.enqueue(object : Callback<PostModels?>{
            override fun onResponse(
                call: Call<PostModels?>,
                response: Response<PostModels?>
            ) {
                if (response.isSuccessful){
                    Log.d("success", "-->"+ (response.body()!!.data[0].courseLevel.toString() ))
                    packData.postValue(response.body())
                }

            }

            override fun onFailure(call: Call<PostModels?>, t: Throwable) {
                Log.i("fail","CheckError:$call")
                call.cancel()
                packData.postValue(PostModels())
            }


        })

    return packData
    }
}



