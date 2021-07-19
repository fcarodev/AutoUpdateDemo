package com.portfolio.autoupdatedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.javiersantos.appupdater.AppUpdater
import com.github.javiersantos.appupdater.enums.Display
import com.github.javiersantos.appupdater.enums.UpdateFrom

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appUpdater = AppUpdater(this)
            .setDisplay(Display.DIALOG)
            .setUpdateFrom(UpdateFrom.JSON)
            .setUpdateJSON("https://github.com/fcarodev/AutoUpdateDemo/blob/master/app/update.json")
        appUpdater.start()
    }
}