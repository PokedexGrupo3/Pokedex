package com.example.pokedex.Features.PokemonData.View

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokedex.Repository.PokemonData.Result
import com.example.pokedex.databinding.FragmentPokemondataRecyclerviewBinding

class PokemonDataAdapter(private val listaPokemons: List<Result>) :
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
        holder.bind(listaPokemons[position])
    }

    override fun getItemCount(): Int = listaPokemons.size

    class ViewHolder(val binding: FragmentPokemondataRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(pokemon: Result) {
            with(binding) {
                txtPokemonName.text = pokemon.name

                Glide
                    .with(itemView.context)
                    .load(pokemon.url)
                    .into(imgCall)

            }
        }
    }
}








