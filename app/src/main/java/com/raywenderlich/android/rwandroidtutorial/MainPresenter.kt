package com.raywenderlich.android.rwandroidtutorial


class MainPresenter(view: MainContract.View,dependencyInjector: DependencyInjector):MainContract {
    private val weatherRepository: WeatherRepository
            = dependencyInjector.weatherRepository()


    private var view: MainContract.View? = view



    private fun loadWeather() {
        val weather = weatherRepository.loadWeather()
        val weatherState = weatherStateForWeather(weather)

        view?.displayWeatherState(weatherState)
    }


    private fun weatherStateForWeather(weather: Weather) : WeatherState {
        if (weather.rain!!.amount!! > 0) {
            return WeatherState.RAIN
        }
        return WeatherState.SUN
    }

}
