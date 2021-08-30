package com.example.pokedex.APIConnection

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIConnection {

    fun pokedexClient():Retrofit{
        return Retrofit.Builder()
               .baseUrl("https://pokeapi.co/api/v2/")
               .addConverterFactory(GsonConverterFactory.create())
               .build()
    }
}