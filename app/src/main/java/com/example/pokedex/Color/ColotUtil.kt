package com.example.pokedex.Color

import android.content.Context
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import com.example.pokedex.R

class PokemonColorUtil(var context: Context) {

    @ColorInt
    fun getPokemonColor(typeOfPokemon: List<String>?): Int {
        val type = typeOfPokemon?.getOrNull(0)
        val color = when (type?.lowercase()) {
            "grass" -> R.color.grass
            "bug" -> R.color.bug
            "fire" -> R.color.fire
            "water" -> R.color.water
            "fighting" ->R.color.fighting
            "normal" -> R.color.normal
            "electric" -> R.color.electric
            "psychic" -> R.color.psychic
            "poison" -> R.color.poison
            "ghost" -> R.color.ghost
            "ground" -> R.color.ground
            "rock" -> R.color.lightBrown
            "dark" -> R.color.dark
            "ice" -> R.color.ice
            "dragon" -> R.color.dragon
            "steel" -> R.color.steel
            "fairy" -> R.color.fairy
            "flying" -> R.color.flying

            else -> R.color.lightBlue
        }
        return convertColor(color)
    }

    @ColorInt
    fun convertColor(@ColorRes color: Int): Int {
        return ContextCompat.getColor(context, color)
    }
}