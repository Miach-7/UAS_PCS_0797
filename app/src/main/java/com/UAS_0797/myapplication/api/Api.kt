package com.UAS_0797.myapplication.api

import com.UAS_0797.myapplication.data.model.DetailUserResponse
import com.UAS_0797.myapplication.data.model.User
import com.UAS_0797.myapplication.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token d1c12b18a1a384a3c5cd7f636e533db54b266905")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token d1c12b18a1a384a3c5cd7f636e533db54b266905")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token d1c12b18a1a384a3c5cd7f636e533db54b266905")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token d1c12b18a1a384a3c5cd7f636e533db54b266905")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}
