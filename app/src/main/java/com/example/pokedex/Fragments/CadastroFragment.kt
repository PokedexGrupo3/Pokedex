package com.example.pokedex.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pokedex.R
import com.example.pokedex.databinding.FragmentCadastroBinding
import com.example.pokedex.databinding.FragmentSaidaBinding

class CadastroFragment : Fragment() {

    private var binding: FragmentCadastroBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCadastroBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnEntrar?.setOnClickListener(){
            findNavController().navigate(R.id.action_cadastroFragment_to_fragmentMenuDex)
        }

        binding?.btnVoltarLogin?.setOnClickListener(){
            findNavController().navigate(R.id.action_cadastroFragment_to_loginFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
