package com.example.pokedex.Features.PokemonData.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex.APIConnection.ResponseApi
import com.example.pokedex.Features.PokemonData.Model.PokemonDataUseCase
import com.example.pokedex.Repository.PokemonData.ListaPokemon
import com.example.pokedex.Repository.PokemonData.Pokemons
import com.example.pokedex.Repository.PokemonData.Result
import kotlinx.coroutines.launch


class PokemonDataViewModel : ViewModel() {

    private val pokemonDataUseCase = PokemonDataUseCase()

    private val _onSuccesPokeLista: MutableLiveData<List<Pokemons>> = MutableLiveData()

    val onSuccessPokeLista: LiveData<List<Pokemons>>
        get() = _onSuccesPokeLista

    private val _onErrorPokeLista: MutableLiveData<String> = MutableLiveData()

    val onErrorPokeLista: LiveData<String>
        get() = _onErrorPokeLista

    fun getListaPokemon() {
        viewModelScope.launch {
            when (val responseApi = pokemonDataUseCase.getListaPokemon()) {
                is ResponseApi.Success -> {
                    _onSuccesPokeLista.postValue(
                        responseApi.data as List<Pokemons>
                    )
                }
                is ResponseApi.Error -> {
                    _onErrorPokeLista.postValue(responseApi.message)
                }
            }
        }
    }
}