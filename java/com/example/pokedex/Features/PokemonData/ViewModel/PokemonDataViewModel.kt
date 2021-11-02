package com.example.pokedex.Features.PokemonData.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokedex.repository.api.PokemonService
import com.example.pokedex.model.PokemonData.Pokemon


class PokemonViewModel : ViewModel() {


    var pokemons = MutableLiveData<List<Pokemon?>>()

    init {
        Thread(Runnable {
            loadPokemons()
        }).start()
    }

    private fun loadPokemons() {
        val pokemonsApiResult = PokemonService.listPokemons()

        pokemonsApiResult?.results?.let {
            pokemons.postValue(it.map { pokemonResult ->
                val number = pokemonResult.id
                    ?.replace("https://pokeapi.co/api/v2/pokemon/", "")
                    ?.replace("/", "")?.toInt()

                val pokemonApiResult = number?.let { it1 -> PokemonService.getPokemon(it1) }

                pokemonApiResult?.let {
                    Pokemon(
                        pokemonApiResult.id,
                        pokemonApiResult.name,
                        pokemonApiResult.typeofpokemon

                    )
                }
            })
        }
    }
}

