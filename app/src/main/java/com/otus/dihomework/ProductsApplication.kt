package com.otus.dihomework

import android.app.Application

class ProductsApplication : Application() {
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().build(this)
    }
}
