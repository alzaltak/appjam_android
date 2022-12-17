package com.aljaldak.culmix.data

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

val serverAPIProvider: ServerAPI = RetrofitClient.build().create(ServerAPI::class.java)

interface ServerAPI {

    @POST("/user/signup")
    suspend fun register(
        @Body registerRequest: RegisterRequest,
    ): Response<Void>

    @POST("/user/token")
    suspend fun login(
        @Body loginRequest: LoginRequest,
    ): Response<Void>

    @POST("/home")
    suspend fun postHome(
        @Body postHomeRequest: PostHomeRequest,
    ): Response<Void>

    @POST("/user/1")
    suspend fun like(
        @Header("Authorization") accessToken: String,
    ): Response<Void>

    @GET("/home")
    suspend fun getHomes(
        @Header("Authorization") accessToken: String,
        @Body add_ress: String,
    ): Response<GetHomesResponse>

    @GET("/user")
    suspend fun getPartners(
        @Header("Authorization") accessToken: String,
    ): Response<GetPartnersResponse>

    @GET("/user/my")
    suspend fun getMyPageInformation(
        @Header("Authorization") accessToken: String,
    ): Response<GetMyPageInformationResponse>

    @PUT("/user/{id}")
    suspend fun postReview(
        @Header("Authorization") accessToken: String,
        @Field("id") id: Int,
    ): Response<PostReviewResponse>

    @DELETE("/user/{id}")
    suspend fun cancelLike(
        @Header("Authorization") accessToken: String,
        @Field("id") id: Int,
    ): Response<Void>
}

object RetrofitClient {

    private var retrofit: Retrofit? = null

    fun build(): Retrofit {
        return retrofit ?: Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL).build()
    }
}

const val BASE_URL = "http://52.79.125.202:8083"