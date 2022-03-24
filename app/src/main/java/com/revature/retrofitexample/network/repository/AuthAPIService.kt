package com.revature.retrofitexample.network.repository

import com.revature.retrofitexample.network.postJob
import com.revature.retrofitexample.network.token
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthAPIService {

    @POST("auth")
    suspend fun getLogin(@Body postJob:postJob):Response<token>
}