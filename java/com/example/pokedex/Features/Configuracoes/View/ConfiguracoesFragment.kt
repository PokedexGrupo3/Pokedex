package com.example.pokedex.Features.Configuracoes.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pokedex.R
import com.example.pokedex.databinding.FragmentConfiguracoesBinding

class ConfiguracoesFragment : Fragment() {

    private var binding:FragmentConfiguracoesBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = FragmentConfiguracoesBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.ivBack?.setOnClickListener(){
            findNavController().navigate(R.id.action_configuracoesFragment_to_fragmentMenuDex)
        }

        binding?.btSair?.setOnClickListener(){
            findNavController().navigate(R.id.action_configuracoesFragment_to_saidaFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}