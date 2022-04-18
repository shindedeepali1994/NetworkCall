package com.example.styliticsnetworkcalls.network

import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

internal class NetworkCall<T : Any>(
    private val callDelegate: Call<T>
) : Call<NetworkResponse<T>> {


    override fun enqueue(callback: Callback<NetworkResponse<T>>) {
        return callDelegate.enqueue(object : Callback<T> {
            override fun onResponse(call: Call<T>, response: Response<T>) {
                val body = response.body()
                val code = response.code()

                if (response.isSuccessful) {
                    callback.onResponse(
                        this@NetworkCall,
                        Response.success(NetworkResponse.Success(body, code))
                    )
                }
            }

            override fun onFailure(call: Call<T>, throwable: Throwable) {

                callback.onResponse(
                    this@NetworkCall,
                    Response.success(NetworkResponse.ApiError(throwable.message))
                )
            }
        })
    }

    override fun clone(): Call<NetworkResponse<T>> = NetworkCall(callDelegate.clone())

    override fun execute(): Response<NetworkResponse<T>> =
        throw UnsupportedOperationException("ResponseCall does not support execute.")

    override fun isExecuted(): Boolean = callDelegate.isExecuted

    override fun cancel() = callDelegate.cancel()

    override fun isCanceled(): Boolean = callDelegate.isCanceled

    override fun request(): Request = callDelegate.request()

    override fun timeout(): Timeout = callDelegate.timeout()
}