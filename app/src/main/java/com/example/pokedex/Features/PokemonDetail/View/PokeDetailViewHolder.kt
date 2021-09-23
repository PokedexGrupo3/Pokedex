package com.example.pokedex.detail

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.detail.Egg
import com.example.pokedex.detail.Level
import com.example.pokedex.R
import com.example.pokedex.detail.Tm

class PokeDetailViewHolder {
}
class EggViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private var nameEgg = itemView.findViewById<TextView>(R.id.nameEgg)
    private var accEgg = itemView.findViewById<TextView>(R.id.accEgg)
    private var powerEgg = itemView.findViewById<TextView>(R.id.powerEgg)
    private var lvlEgg = itemView.findViewById<TextView>(R.id.lvlegg)

    fun bind(egg: Egg){
        nameEgg.text = egg.name
        accEgg.text = egg.acc.toString()
        powerEgg.text = egg.power.toString()
        lvlEgg.text = egg.lvl

    }
}
class TmViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private var nameTM = itemView.findViewById<TextView>(R.id.nameTM)
    private var accTM = itemView.findViewById<TextView>(R.id.accTM)
    private var powerTM = itemView.findViewById<TextView>(R.id.powerTM)
    private var lvlTM = itemView.findViewById<TextView>(R.id.lvlTM)

    fun bind(tm: Tm){
        nameTM.text = tm.name
        accTM.text = tm.acc.toString()
        powerTM.text = tm.power.toString()
        lvlTM.text = tm.lvl

    }
}
class LevelViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private var nameLevel = itemView.findViewById<TextView>(R.id.nameLevel)
    private var accLevel = itemView.findViewById<TextView>(R.id.accLevel)
    private var powerLevel = itemView.findViewById<TextView>(R.id.powerLevel)
    private var lvlLevel = itemView.findViewById<TextView>(R.id.lvlLevel)

    fun bind(level: Level){
        nameLevel.text = level.name
        accLevel.text = level.acc.toString()
        powerLevel.text = level.power.toString()
        lvlLevel.text = level.lvl

    }
}
