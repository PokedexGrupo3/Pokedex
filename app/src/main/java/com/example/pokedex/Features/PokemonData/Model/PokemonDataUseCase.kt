package com.example.pokedex.Features.PokemonData.Model

import com.example.pokedex.APIConnection.ResponseApi
import com.example.pokedex.Features.PokemonData.Repository.PokemonDataRepository
import com.example.pokedex.Repository.PokemonData.ListaPokemon

class PokemonDataUseCase{
    private val pokemonDataRepository = PokemonDataRepository()

    suspend fun getListaPokemon(): ResponseApi{
        return when(val responseApi = pokemonDataRepository.getPokemonList()){
            is ResponseApi.Success -> {
                var data = responseApi.data as? ListaPokemon
                val result = data?.results?.map {
                    it
                }
                ResponseApi.Success(result)
            }
            is ResponseApi.Error ->{
                responseApi
            }
        }
    }
}