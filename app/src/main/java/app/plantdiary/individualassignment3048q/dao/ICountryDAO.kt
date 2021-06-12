package app.plantdiary.individualassignment3048q.dao

import app.plantdiary.individualassignment3048q.dto.Country
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ICountryDAO {

    @GET("core/country-list/r/0.html")
    fun getAllCountries(): Call<ArrayList<Country>>

    @GET("core/country-list/r/0.html")
    fun getCountries(@Query("Combined_Name") name: String) : Call<ArrayList<Country>>
}