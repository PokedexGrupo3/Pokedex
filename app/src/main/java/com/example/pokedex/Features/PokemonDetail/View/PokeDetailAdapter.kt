package com.example.pokedex.detail


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R


//Adapter para o fragment_egg

class EggAdapter (
    private val listEgg: List<Egg>

) : RecyclerView.Adapter<EggViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EggViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_egg, parent, false )
        return EggViewHolder(view)
    }
    override fun getItemCount() = listEgg.size

    override fun onBindViewHolder(holder: EggViewHolder, position: Int) = holder.bind(listEgg[position])


}

//Adapter para o fragment_level

class LevelAdapter (
    private val listLevel: List<Level>
) : RecyclerView.Adapter<LevelViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_level, parent, false )
        return LevelViewHolder(view)
    }
    override fun getItemCount() = listLevel.size

    override fun onBindViewHolder(holder: LevelViewHolder, position: Int) = holder.bind(listLevel[position])


}

//Adapter para o fragment_TM

class TmAdapter (
    private val listTm: List<Tm>
) : RecyclerView.Adapter<TmViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  TmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_tm, parent, false )
        return TmViewHolder(view)
    }
    override fun getItemCount() = listTm.size

    override fun onBindViewHolder(holder: TmViewHolder, position: Int) = holder.bind(listTm[position])


}

//Adapter para o tablayout

class DetailAdapter(
    private val fragments :List<Fragment>,
        ) : RecyclerView.Adapter<DetailAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_level, parent, false)
        return ViewPagerViewHolder(view)

    }
    override fun getItemCount() = fragments.size


    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val curlFragment = fragments[position]
        holder.itemView
    }



}