package com.example.styliticsnetworkcalls.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.example.OutfitItems
import com.example.styliticsnetworkcalls.network.NetworkResponse
import com.example.styliticsnetworkcalls.repository.OutfitsRepository
import kotlinx.coroutines.launch

class OutfitItemViewModel : ViewModel() {

    var outfitsResult = MutableLiveData<List<OutfitItems>>()

    fun outfits(){
        viewModelScope.launch {
            when(val response = OutfitsRepository().getOutfits()){
                is NetworkResponse.Success->{outfitsResult.value = response.body }
            }
        }
    }
}