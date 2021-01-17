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
    @Headers("Authorization: token 190066f5712c15867e4c7d63f13d4fa2f4a6b82b")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 190066f5712c15867e4c7d63f13d4fa2f4a6b82b")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 190066f5712c15867e4c7d63f13d4fa2f4a6b82b")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 190066f5712c15867e4c7d63f13d4fa2f4a6b82b")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}
