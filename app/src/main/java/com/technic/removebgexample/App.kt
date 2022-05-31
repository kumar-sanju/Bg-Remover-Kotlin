package com.technic.removebgexample

import android.app.Application
import com.technic.removebg.RemoveBg

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        /**
         * GET YOUR API KEY FROM HERE -> https://www.remove.bg/r/1BGpRCPUP1WS4Mzog6Sw9BCP
         */
//        RemoveBg.init("2sByKahRpKVzDgCqJWZbUrpU")
        RemoveBg.init("YCnafPKGDukSyo5xTKcgYBa8")
    }
}