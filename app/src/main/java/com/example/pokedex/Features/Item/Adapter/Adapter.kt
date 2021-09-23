package com.example.pokedex.Features.Item.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokedex.Repository.PokemonData.Item
import com.example.pokedex.databinding.FragmentItemRecyclerBinding


class Adapter (
    private val listaItem: List<Item>,
): RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            FragmentItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = listaItem[position]

        holder.imageItem.setImageResource(currentItem.imageItem)
        holder.name.text = currentItem.nameItem
        holder.description.text = currentItem.descripitonName

    }

    override fun getItemCount(): Int = listaItem.size

    class ViewHolder(val binding: FragmentItemRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {

            val imageItem : ImageView = binding.itemImage
            val name : TextView = binding.itemName
            val description : TextView = binding.description
    }
}


