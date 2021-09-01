package com.example.pokedex.utils

sealed class Command {
    class Loading(val value: Boolean): Command()
    class Error(val error: String): Command()
}