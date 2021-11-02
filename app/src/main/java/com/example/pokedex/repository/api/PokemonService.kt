package com.example.pokedex.repository.api

import com.example.pokedex.model.PokemonData.ListaPokemon
import com.example.pokedex.model.PokemonData.PokemonResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object PokemonService {
    private val service: PokedexAPIGetters

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(PokedexAPIGetters::class.java)
    }

    fun listPokemons(limit: Int = 500): ListaPokemon? {
        val call = service.listPokemons(limit)

        return call.execute().body()
    }

    fun getPokemon(number: Int): PokemonResult? {
        val call = service.getPokemon(number)

        return call.execute().body()
    }


}



