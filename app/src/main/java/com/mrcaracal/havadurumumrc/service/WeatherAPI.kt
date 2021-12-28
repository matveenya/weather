package com.mrcaracal.havadurumumrc.service

import com.mrcaracal.havadurumumrc.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {

    //http://api.openweathermap.org/data/2.5/weather?q=minsk&APPID=d38e9edfe3775201d24f88cdbed639f4

    @GET("data/2.5/weather?&units=metric&q=minsk&APPID=d38e9edfe3775201d24f88cdbed639f4")
    fun getData(
        @Query("q") cityName: String
    ): Single<WeatherModel>

}