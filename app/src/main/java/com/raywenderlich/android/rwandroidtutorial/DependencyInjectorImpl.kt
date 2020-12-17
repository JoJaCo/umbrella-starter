package com.raywenderlich.android.rwandroidtutorial

class DependencyInjectorImp: DependencyInjector {
    override fun weatherRepository() : WeatherRepository {
        return WeatherRepositoryImpl()
    }
}