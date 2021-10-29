package com.example.pokedex.model.PokemonData

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize

data class ListaPokemon(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResult>
)


data class PokemonResult(
    val name: String,
    val id: Int,
    val url: String
)


