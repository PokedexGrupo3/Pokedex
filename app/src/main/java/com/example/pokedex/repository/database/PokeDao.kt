package com.example.pokedex.repository.database

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.example.pokedex.model.PokemonData.Pokemon

@Dao
interface PokeDao {

    @Transaction
    @Query("SELECT * FROM pokemon")
    suspend fun getAllPokemon(): List<Pokemon>

    /* READ */
    @Query("SELECT * FROM pokemon WHERE number = :pokeNumber")
    suspend fun getPokemon(pokeNumber: Int): Pokemon

    //CREATE
    @Insert(onConflict = REPLACE)
    suspend fun insertPokemon(pokemon: Pokemon)

    //DELETE
    @Delete
    suspend fun delete(pokemon: Pokemon)

}