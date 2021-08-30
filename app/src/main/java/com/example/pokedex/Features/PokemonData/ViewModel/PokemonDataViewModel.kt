package com.example.pokedex.Features.PokemonData.ViewModel

import androidx.lifecycle.ViewModel
import com.example.pokedex.Features.PokemonData.Model.PokemonDataUseCase

class PokemonDataViewModel: ViewModel() {
    var pokemonDataUseCase = PokemonDataUseCase()
}