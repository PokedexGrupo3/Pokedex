package com.example.pokedex.Features.PokemonData.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokedex.databinding.FragmentPokemonDataBinding
import com.example.pokedex.Repository.PokemonData.Pokemon
import com.example.pokedex.R

class PokemonDataFragment : Fragment() {

    private var binding:FragmentPokemonDataBinding? = null

    var listaPokemons = listOf(
        Pokemon(
            R.drawable.butterfree012,
            "Buterfree",
            "012"
        ),
        Pokemon(
            R.drawable.chansey113,
            "Chansey",
            "113"
        ),
        Pokemon(
            R.drawable.charmander004,
            "Charmander",
            "004"
        ),
        Pokemon(
            R.drawable.cubone104,
            "Cubone",
            "104"
        ),
        Pokemon(
            R.drawable.gengar094,
            "Gengar",
            "094"
        ), Pokemon(
            R.drawable.jigglypuff039,
            "jigglypuff",
            "039"
        ), Pokemon(
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
        binding = FragmentPokemonDataBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding?.ivGear?.setOnClickListener(){
            findNavController().navigate(R.id.action_pokemonDataFragment_to_configuracoesFragment)
        }

        binding?.ivBack?.setOnClickListener(){
            findNavController().navigate(R.id.action_pokemonDataFragment_to_fragmentMenuDex)
        }

        val pokemonAdapter = PokemonDataAdapter(listaPokemons = listaPokemons)
        binding?.let {
            with(it){
                rvListaPokemons.layoutManager = LinearLayoutManager(context)
                rvListaPokemons.adapter = pokemonAdapter
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}