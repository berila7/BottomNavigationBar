package com.example.matcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.matcomponents.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_1 -> {
                    // Handle home icon selection
                    true
                }
                R.id.item_2 -> {
                    // Handle search icon selection
                    true
                }
                R.id.item_3 -> {
                    true
                }
                else -> false
            }
        }
    }
}