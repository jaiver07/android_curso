package com.aristidevs.horoscapp.ui.detail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aristidevs.horoscapp.R
import com.aristidevs.horoscapp.databinding.ActivityHoroscopeDetailBinding
import com.aristidevs.horoscapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HoroscopeDetailActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityHoroscopeDetailBinding
    private val horoscopeDetailViewModel:HoroscopeDetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}