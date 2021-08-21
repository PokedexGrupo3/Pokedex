package com.example.pokedex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.databinding.FragmentPokemonDataBinding
import com.example.pokedexmock.adapter.Pokemons

class PokemonDataFragment : Fragment() {

    private var binding:FragmentPokemonDataBinding? = null

    private lateinit var pokemonview: View
    private lateinit var recyclerView: RecyclerView

    private val listaPokemons = arrayListOf(
        Pokemons(
            R.drawable.butterfree012,
            "Buterfree",
            "012"
        ),
        Pokemons(
            R.drawable.chansey113,
            "Chansey",
            "113"
        ),
        Pokemons(
            R.drawable.charmander004,
            "Charmander",
            "004"
        ),
        Pokemons(
            R.drawable.cubone104,
            "Cubone",
            "104"
        ),
        Pokemons(
            R.drawable.gengar094,
            "Gengar",
            "094"
        ), Pokemons(
            R.drawable.jigglypuff039,
            "jigglypuff",
            "039"
        ), Pokemons(
            R.drawable.kadabra064,
            "Kadabra",
            "064"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        pokemonview = inflater.inflate(R.layout.fragment_pokemon_data, container, false)
        return pokemonview
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = pokemonview.findViewById(R.id.rv_listaPokemons)


        recyclerView.apply {
            setHasFixedSize(true)
            recyclerView.layoutManager = GridLayoutManager(context, 2)

            adapter = PokemonAdapter(listaPokemons)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}