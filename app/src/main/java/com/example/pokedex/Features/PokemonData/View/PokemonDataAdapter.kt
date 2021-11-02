package com.example.pokedex.Features.PokemonData.View

import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.model.PokemonData.Pokemon
import com.bumptech.glide.Glide
import com.example.pokedex.Color.PokemonColorUtil
import com.example.pokedex.databinding.ItemPokemonBinding

class PokemonDataAdapter(private val listaPokemons: List<Pokemon?>) :
    RecyclerView.Adapter<PokemonDataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPokemonBinding.inflate(
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

    class ViewHolder(val binding: ItemPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(pokemon: Pokemon) {
            binding.txtPokemonName.text = pokemon.name
            binding.txtPokemonNumber.text = "Nº ${pokemon.formattedNumber}"

            val color = PokemonColorUtil(itemView.context).getPokemonColor(pokemon.typeofpokemon)
            binding.cvPokemon.background.colorFilter =
                PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP)

            pokemon.typeofpokemon?.getOrNull(0).let { firstType ->
                binding.pokeType1.text = firstType
                binding.pokeType1?.isVisible = firstType != null
                
            }

            pokemon.typeofpokemon?.getOrNull(1).let { secondType ->
                binding.pokeType2.text = secondType
                binding.pokeType2.isVisible = secondType != null
            }

            pokemon.typeofpokemon?.getOrNull(2).let { thirdType ->
                binding.pokeType3.text = thirdType
                binding.pokeType3.isVisible = thirdType != null
            }

            val image = binding.imgCall

            Glide.with(itemView.context)
                .load(pokemon.imageUrl)
                .into(image)
        }
    }
}







