package com.example.pokedex.Features.Item.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pokedex.APIConnection.APIConnection
import com.example.pokedex.Features.PokemonData.Repository.PokemonDataRepository
import com.example.pokedex.R
import com.example.pokedex.Repository.PokemonData.Item
import com.example.pokedex.databinding.FragmentItemBinding
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokedex.Features.Item.Adapter.Adapter
import com.example.pokedex.databinding.FragmentDetailBinding
import com.example.pokedex.databinding.FragmentItemRecyclerBinding


class ItemFragment : Fragment() {

    private var binding : FragmentItemBinding? = null

    var listaItem = listOf(
        Item(
            R.drawable.butterfree012,
            "Buterfree",
            "012",

            ),
        Item(
            R.drawable.chansey113,
            "Chansey",
            "113",

        ),
        Item(
            R.drawable.charmander004,
            "Charmander",
            "004",

        ),
        Item(
            R.drawable.cubone104,
            "Cubone",
            "104",

        ),
        Item(
            R.drawable.gengar094,
            "Gengar",
            "094",


        ),
        Item(
            R.drawable.jigglypuff039,
            "Jigglypuff",
            "039",

        ),
        Item(
            R.drawable.kadabra064,
            "Kadabra",
            "064",

        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentItemBinding.inflate(layoutInflater)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentItemBinding.inflate(inflater,container,false)

        binding?.rvListaItem?.adapter = Adapter(listaItem)
        binding?.rvListaItem?.layoutManager = LinearLayoutManager(context)
        binding?.rvListaItem?.setHasFixedSize(true)

        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding?.ivGear?.setOnClickListener(){
            findNavController().navigate(R.id.action_itemFragment_to_configuracoesFragment)
        }

        binding?.ivBack?.setOnClickListener(){
            findNavController().navigate(R.id.action_itemFragment_to_fragmentMenuDex)
        }

    }

    suspend fun getPokemonTest(){
        var pokemonDataRepository = PokemonDataRepository()
        pokemonDataRepository.safeApiCall {
            APIConnection.pokemonApi.getPokemonList()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}