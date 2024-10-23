package com.breezefieldaereo.features.weather.api

import com.breezefieldaereo.base.BaseResponse
import com.breezefieldaereo.features.task.api.TaskApi
import com.breezefieldaereo.features.task.model.AddTaskInputModel
import com.breezefieldaereo.features.weather.model.ForeCastAPIResponse
import com.breezefieldaereo.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}