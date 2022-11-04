package com.example.forms_spinner.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory():  ViewModelProvider.NewInstanceFactory(){
    @Suppress("Unchecked_CAST")
    override fun <T:androidx.lifecycle.ViewModel> create(modelClass: Class<T>): T {
        return cmaViewModel() as T
    }
}


