package com.example.pokedex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedexmock.adapter.Pokemons

class PokemonAdapter (private val listaPokemons: List<Pokemons>): RecyclerView.Adapter<PokemonViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_pokemondata_recyclerview, parent, false)
        return PokemonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) =
        holder.bind(listaPokemons[position])

    override fun getItemCount(): Int = listaPokemons.size

}