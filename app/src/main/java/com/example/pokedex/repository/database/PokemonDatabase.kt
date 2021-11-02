package com.example.pokedex.repository.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import com.example.pokedex.model.PokemonData.Pokemon

object PokemonDatabase{

    @Database(entities = [Pokemon::class], version = 1)
    abstract class PokemonDatabase : RoomDatabase() {
        abstract fun pokeDao(): PokeDao

    }

    fun getDatabase(context: Context) : PokemonDatabase {
        return Room.databaseBuilder(
            context,
            PokemonDatabase::class.java, "Poke_db"
        ).build()
    }
}
