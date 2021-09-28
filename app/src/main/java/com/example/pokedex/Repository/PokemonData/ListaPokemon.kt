package com.example.pokedex.Repository.PokemonData

data class ListaPokemon(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>,

)

