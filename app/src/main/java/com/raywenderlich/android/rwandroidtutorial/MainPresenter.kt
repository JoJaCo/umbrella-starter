package com.raywenderlich.android.rwandroidtutorial


class MainPresenter(view: MainContract.View,dependencyInjector: DependencyInjector):MainContract {
    private val weatherRepository: WeatherRepository
            = dependencyInjector.weatherRepository()


    private var view: MainContract.View? = view
}
