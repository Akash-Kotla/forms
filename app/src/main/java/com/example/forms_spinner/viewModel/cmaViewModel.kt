package com.example.forms_spinner.viewModel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.example.forms_spinner.model.PostModels
import com.example.forms_spinner.repository.AllPackRepository

class cmaViewModel: ViewModel() {

    var cmaLiveData = MutableLiveData<PostModels>()
    private var getRepository: AllPackRepository = AllPackRepository()



    fun getuserlist(pack: String){
        cmaLiveData = getRepository.getPackageRespository(pack)


    }



}