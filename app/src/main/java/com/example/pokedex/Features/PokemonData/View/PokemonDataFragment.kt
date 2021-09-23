package com.example.pokedex.Features.PokemonData.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokedex.Features.PokemonData.ViewModel.PokemonDataViewModel
import com.example.pokedex.databinding.FragmentPokemonDataBinding
import com.example.pokedex.R

class PokemonDataFragment : Fragment() {

    private var binding: FragmentPokemonDataBinding? = null
    private lateinit var viewModel: PokemonDataViewModel


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
            viewModel = ViewModelProvider(it)[PokemonDataViewModel::class.java]

            viewModel.getListaPokemon()
        }

        setupObservables()

    }

    private fun setupObservables() {
        activity?.let {
            viewModel.onSuccessPokeLista.observe(viewLifecycleOwner, {
                it?.let {
                val pokemonDataAdapter = PokemonDataAdapter(
                    listaPokemons = it
                )
                    binding?.let {
                        with(it){
                            rvListaPokemons.apply {
                                layoutManager = LinearLayoutManager(this.context)
                                adapter = pokemonDataAdapter
                            }
                        }
                    }
                }

            })
        }

        viewModel.onErrorPokeLista.observe(viewLifecycleOwner, {
            it
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}
