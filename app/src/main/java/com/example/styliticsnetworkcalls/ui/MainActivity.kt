package com.example.styliticsnetworkcalls.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.styliticsnetworkcalls.R
import com.example.styliticsnetworkcalls.viewModel.OutfitItemViewModel


class MainActivity : AppCompatActivity() {

    private val viewModel:OutfitItemViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.outfitsResult.observe(this, Observer { outfitItemList ->
            Log.i("List_of_data"," $outfitItemList")
        })

        viewModel.outfits()

    }

    }

