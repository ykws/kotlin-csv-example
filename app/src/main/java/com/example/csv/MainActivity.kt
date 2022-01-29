package com.example.csv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            csvReader().open(assets.open("valid.csv")) {
                readAllWithHeaderAsSequence().forEach { row: Map<String, String> ->
                    Log.d("CSV", row.getValue("ame"))
                }
            }
        } catch(e: Exception) {
            e.printStackTrace()
        }
    }
}