package com.example.pokedex.Features.PokemonData.View

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.databinding.FragmentPokemondataRecyclerviewBinding
import com.example.pokedex.Repository.PokemonData.Pokemon

class PokemonDataAdapter (private val listaPokemons: List<Pokemon>): RecyclerView.Adapter<PokemonDataAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FragmentPokemondataRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listaPokemons[position])
    }

    override fun getItemCount(): Int = listaPokemons.size

    class ViewHolder(val binding:FragmentPokemondataRecyclerviewBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(pokemon: Pokemon){
            binding.imgCall.setImageResource(pokemon.image)
            binding.txtPokemonName.text = pokemon.name
            binding.txtPokemonNumber.text = pokemon.number
        }
    }
}





