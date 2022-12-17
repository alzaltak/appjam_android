package com.aljaldak.culmix.data

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST

interface ServerAPI {

    @POST("/user/signup")
    suspend fun register(
        registerRequest: RegisterRequest,
    ): Response<Void>

    @POST("/login/token")
    suspend fun login(
        loginRequest: LoginRequsest,
    ): Response<Void>
}

data class RegisterRequest(
    val account_id: String,
    val password: String,
    val last_name: String,
    val first_name: String,
    val my_lang: String,
    val email: String,
)

data class LoginRequsest(
    val account_id: String,
    val password: String,
)

object RetrofitClient {

    private var retrofit: Retrofit? = null

    fun build(): Retrofit {
        return retrofit ?: Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory())..build()
    }
}

const val BASE_URL = "http://52.79.125.202:8083"