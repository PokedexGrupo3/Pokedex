package com.example.pokedex.repository.api

import com.example.pokedex.model.PokemonData.ListaPokemon
import com.example.pokedex.model.PokemonData.PokemonResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokedexAPIGetters {

    @GET("pokemon")
    fun listPokemons(@Query("limit") limit: Int): Call<ListaPokemon>

    @GET("pokemon/{number}")
    fun getPokemon(@Path("number") number: Int): Call<PokemonResult>

}