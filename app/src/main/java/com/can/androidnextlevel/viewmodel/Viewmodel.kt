package com.can.androidnextlevel.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.can.androidnextlevel.model.Country

class FeedViewModel:ViewModel() {
    val countries = MutableLiveData<List<Country>>()
    val countryError = MutableLiveData<Boolean>()
    val countryLoading = MutableLiveData<Boolean>()

    fun refreshData(){

        val country = Country("Turkey","Asia","Ankara","TRY","Turkish",".com")
        val country2 = Country("France","Europe","Paris","EUR","French",".com")
        val country3 = Country("Germany","Europe","Belin","EUR","German",".com")

        val countryList = arrayListOf<Country>(country,country2,country3)


        countries.value = countryList
        countryError.value= false
        countryLoading.value= false


    }
}