package com.breezefieldaereo.features.weather.api

import com.breezefieldaereo.features.task.api.TaskApi
import com.breezefieldaereo.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}