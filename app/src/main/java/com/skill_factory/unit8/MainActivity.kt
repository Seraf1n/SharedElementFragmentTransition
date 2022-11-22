package com.skill_factory.unit8


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

const val NUM_PAGES = 5

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        supportFragmentManager.beginTransaction()
            //.replace(R.id.root, MainFragment())
            .attach(MainFragment())
            .commit()
    }
}