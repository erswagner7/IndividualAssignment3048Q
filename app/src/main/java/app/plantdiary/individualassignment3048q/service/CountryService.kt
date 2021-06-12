package app.plantdiary.individualassignment3048q.service

import androidx.lifecycle.MutableLiveData
import app.plantdiary.individualassignment3048q.dto.Country

class CountryService {

    fun fetchCountries() : MutableLiveData<ArrayList<Country>> {
        return MutableLiveData<ArrayList<Country>>()
    }
}