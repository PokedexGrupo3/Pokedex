package com.example.pokedex.Features.PokemonData.Repository

import com.example.pokedex.APIConnection.APIConnection
import com.example.pokedex.APIConnection.ResponseApi
import com.example.pokedex.Base.BaseRepository

class PokemonDataRepository : BaseRepository() {
    suspend fun getPokemonList(): ResponseApi {
        return safeApiCall{
            APIConnection.pokemonApi.getPokemonList()
        }
    }
}