package com.bignerdranch.android.retrofitexample.repository

import com.bignerdranch.android.retrofitexample.api.RetrofitInstance
import com.bignerdranch.android.retrofitexample.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getPost2(number: Int) : Response<Post>{
        return RetrofitInstance.api.getPost2(number)
    }

    suspend fun getCuctomPosts(userId: Int, sort: String, order: String): Response<List<Post>>{
        return RetrofitInstance.api.getCuctomPosts(userId, sort, order)
    }

    suspend fun getCuctomPosts2(userId: Int, options: Map<String, String>): Response<List<Post>>{
        return RetrofitInstance.api.getCuctomPosts2(userId, options)
    }
}