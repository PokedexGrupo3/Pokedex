package com.example.pokedex.Features.PokemonData.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokedex.Features.PokemonData.ViewModel.PokemonViewModel
import com.example.pokedex.Features.PokemonData.ViewModel.PokemonViewModelFactory
import com.example.pokedex.databinding.FragmentPokemonDataBinding
import com.example.pokedex.R
import com.example.pokedex.model.PokemonData.Pokemon

class PokemonDataFragment : Fragment() {

    private var binding: FragmentPokemonDataBinding? = null

    private val viewModel by lazy {
        ViewModelProvider(this, PokemonViewModelFactory())
            .get(PokemonViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPokemonDataBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding?.ivGear?.setOnClickListener() {
            findNavController().navigate(R.id.action_pokemonDataFragment_to_configuracoesFragment)
        }

        binding?.ivBack?.setOnClickListener() {
            findNavController().navigate(R.id.action_pokemonDataFragment_to_fragmentMenuDex)
        }


        activity?.let {
            viewModel.pokemons.observe(viewLifecycleOwner, Observer {
                setupObservables(it)
                })
        }
    }

    fun setupObservables(pokemons: List<Pokemon?>) {
        activity?.let {
            viewModel.pokemons.observe(viewLifecycleOwner, {
                it?.let {
                    val pokemonDataAdapter = PokemonDataAdapter(
                        listaPokemons = it
                    )
                    binding?.let {
                        with(it) {
                            rvlistaPokemons.apply {
                                layoutManager = LinearLayoutManager(this.context)
                                adapter = pokemonDataAdapter
                            }
                        }
                    }
                }

            })

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}




