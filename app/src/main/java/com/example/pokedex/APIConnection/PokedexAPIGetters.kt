package com.example.pokedex.APIConnection

import com.example.pokedex.Repository.PokemonData.ListaPokemon
import retrofit2.Response
import retrofit2.http.GET

interface PokedexAPIGetters {

    @GET("pokemon/")
    suspend fun getPokemonList(): Response<ListaPokemon>
}