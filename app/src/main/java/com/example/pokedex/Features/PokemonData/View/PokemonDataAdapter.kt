package com.example.pokedex.Features.PokemonData.View

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.model.PokemonData.Pokemon
import com.bumptech.glide.Glide
import com.example.pokedex.databinding.FragmentPokemondataRecyclerviewBinding

class PokemonDataAdapter(private val listaPokemons: List<Pokemon?>) :
    RecyclerView.Adapter<PokemonDataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FragmentPokemondataRecyclerviewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        listaPokemons[position]?.let { holder.bind(it) }
    }

    override fun getItemCount(): Int = listaPokemons.size

    class ViewHolder(val binding: FragmentPokemondataRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(pokemon: Pokemon) {
            binding.txtPokemonName.text = pokemon.name
            binding.txtPokemonNumber.text = "Nº ${pokemon.formattedNumber}"

            val image = binding.imgCall

            Glide.with(itemView.context)
                .load(pokemon.imageUrl)
                .into(image)
        }
    }
}







