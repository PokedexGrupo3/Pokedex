package com.example.pokedex

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedexmock.adapter.Pokemons

class PokemonViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    private var imgCall = itemView.findViewById<ImageView>(R.id.imgCall)
    private var nameCall = itemView.findViewById<TextView>(R.id.txtPokemonName)
    private var numberCall = itemView.findViewById<TextView>(R.id.txtPokemonNumber)

    fun bind(pokemons: Pokemons){
        imgCall.setImageResource(pokemons.image)
        nameCall.text = pokemons.name
        numberCall.text = pokemons.number
    }
}