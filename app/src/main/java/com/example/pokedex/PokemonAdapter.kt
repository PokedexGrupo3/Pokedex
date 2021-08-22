package com.example.pokedex

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.databinding.FragmentPokemondataRecyclerviewBinding
import com.example.pokedexmock.adapter.Pokemons

class PokemonAdapter (private val listaPokemons: List<Pokemons>): RecyclerView.Adapter<PokemonAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FragmentPokemondataRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonAdapter.ViewHolder, position: Int) {
        holder.bind(listaPokemons[position])
    }

    override fun getItemCount(): Int = listaPokemons.size

    class ViewHolder(val binding:FragmentPokemondataRecyclerviewBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(pokemon: Pokemons){
            binding.imgCall.setImageResource(pokemon.image)
            binding.txtPokemonName.text = pokemon.name
            binding.txtPokemonNumber.text = pokemon.number
        }
    }
}





