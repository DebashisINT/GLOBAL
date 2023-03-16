package com.globalfsm.features.weather.api

import com.globalfsm.base.BaseResponse
import com.globalfsm.features.task.api.TaskApi
import com.globalfsm.features.task.model.AddTaskInputModel
import com.globalfsm.features.weather.model.ForeCastAPIResponse
import com.globalfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}