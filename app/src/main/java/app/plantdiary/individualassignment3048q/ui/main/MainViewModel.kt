package app.plantdiary.individualassignment3048q.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.plantdiary.individualassignment3048q.dto.Country

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    var countries: MutableLiveData<ArrayList<Country>> = MutableLiveData<ArrayList<Country>>()

    fun fetchCountries()
    {

    }
}
