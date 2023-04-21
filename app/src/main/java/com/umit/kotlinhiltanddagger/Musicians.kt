package com.umit.kotlinhiltanddagger

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

//Constructor Injection
@ActivityScoped
class Musicians @Inject constructor(instrument: Instrument, band: Band) {
    fun sing() {
        println("working..")
    }
}