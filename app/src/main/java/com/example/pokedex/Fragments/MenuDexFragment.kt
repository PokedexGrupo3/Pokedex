package com.example.pokedex.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pokedex.R
import com.example.pokedex.databinding.FragmentMenuDexBinding


class MenuDexFragment : Fragment() {

    private var binding:FragmentMenuDexBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuDexBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.imgPokedex?.setOnClickListener(){
            findNavController().navigate(R.id.action_fragmentMenuDex_to_pokemonDataFragment)
        }

        binding?.imgDex2?.setOnClickListener(){
            findNavController().navigate(R.id.action_fragmentMenuDex_to_configuracoesFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}