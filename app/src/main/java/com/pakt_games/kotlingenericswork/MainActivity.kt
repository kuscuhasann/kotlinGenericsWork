package com.pakt_games.kotlingenericswork

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.databinding.DataBindingUtil
import com.pakt_games.kotlingenericswork.databinding.ActivityMainBinding
import com.pakt_games.kotlingenericswork.model.City

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.activity_main, null, false)
        setContentView(binding.root)
        cityConfuguration()
    }

    private fun cityConfuguration() {
        val cityCode: City<Int> = City(16)
        val cityName: City<String> = City("Bursa")
        binding.buttonCityCode.setOnClickListener {
            Toast.makeText(this, "City Code: ${cityCode.value}", Toast.LENGTH_SHORT).show()
        }
        binding.buttonCityName.setOnClickListener {
            Toast.makeText(this, "City Name: ${cityName.value}", Toast.LENGTH_SHORT).show()
        }
    }
}