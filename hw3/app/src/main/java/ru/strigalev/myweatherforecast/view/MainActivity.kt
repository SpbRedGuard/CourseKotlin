package ru.strigalev.myweatherforecast.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.strigalev.myweatherforecast.R
import ru.strigalev.myweatherforecast.view.main.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitAllowingStateLoss()
        }
    }
}