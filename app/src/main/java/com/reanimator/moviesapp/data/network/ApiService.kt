package com.reanimator.moviesapp.data.network

import com.reanimator.moviesapp.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/show")
    suspend fun getAllMovies() : Response<List<Movies>>
}