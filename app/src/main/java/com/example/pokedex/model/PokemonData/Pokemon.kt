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
    val number: Int,
    @ColumnInfo
    val name: String

) : Parcelable {

    @IgnoredOnParcel
    val formattedNumber = number.toString().padStart(3, '0')


    @IgnoredOnParcel
    @ColumnInfo
    val imageUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/$formattedNumber.png"
}
