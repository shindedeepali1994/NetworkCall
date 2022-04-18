package com.example.styliticsnetworkcalls.network

sealed class NetworkResponse<T> {

    class Success<T>(val body: T?, val code: Int) : NetworkResponse<T>()

    class ApiError<T>(val message: String?) : NetworkResponse<T>()

}