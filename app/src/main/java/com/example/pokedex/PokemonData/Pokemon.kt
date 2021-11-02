package com.example.pokedex.model.PokemonData

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class Pokemon(
    @PrimaryKey
    var number: String? = null,
    var abilities: String? = null,
    var attack: List<String>? = null,
    var base_exp: String? = null,
    var category: String? = null,
    var cycles: String? = null,
    var defense: Int? = null,
    var egg_groups: String? = null,
    var evolutions: List<String>? = null,
    var evolvedfrom: String? = null,
    var female_percentage: String? = null,
    var genderless: Int? = null,
    var height: String? = null,
    var hp: Int? = null,
    var imageurl: String? = null,
    var male_percentage: String? = null,
    var name: String? = null,
    var reason: String? = null,
    var special_attack: Int? = null,
    var special_defense: Int? = null,
    var speed: Int? = null,
    var total: Int? = null,
    var typeofpokemon: List<String>? = null,
    var weaknesses: List<String>? = null,
    var weight: String? = null,
    var xdescription: String? = null,
    var ydescription: String? = null


) : Parcelable {

    @IgnoredOnParcel
    val formattedNumber = number.toString().padStart(3, '0')


    @IgnoredOnParcel
    @ColumnInfo
    val imageUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/$formattedNumber.png"
}
