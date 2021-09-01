package com.example.pokedex.APIConnection

sealed class ResponseApi {
    class Success(var data:Any?) : ResponseApi()
    class Error(var message:String) : ResponseApi()
}