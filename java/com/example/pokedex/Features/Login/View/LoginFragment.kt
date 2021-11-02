package com.example.pokedex.Features.Login.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pokedex.Main.MainActivity
import com.example.pokedex.R
import com.example.pokedex.databinding.FragmentLoginBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

class LoginFragment : Fragment() {


    private var binding:FragmentLoginBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken("AIzaSyACJkc1GxPcH-YX2vwABFWlhBudrvnkero")
            .requestEmail()
            .build()

        binding?.btnGoogle?.setOnClickListener { findNavController().navigate(R.id.action_loginFragment_to_fragmentMenuDex)  }

        binding?.btnEntrar?.setOnClickListener{findNavController().navigate(R.id.action_loginFragment_to_fragmentMenuDex)}



    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}