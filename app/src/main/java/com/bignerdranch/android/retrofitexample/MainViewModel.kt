package com.bignerdranch.android.retrofitexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bignerdranch.android.retrofitexample.model.Post
import com.bignerdranch.android.retrofitexample.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {

    val myResponse: MutableLiveData<Response<Post>> = MutableLiveData()
    val myResponse2: MutableLiveData<Response<Post>> = MutableLiveData()
    val myCustomPosts: MutableLiveData<Response<List<Post>>> = MutableLiveData()
    val myCustomPosts2: MutableLiveData<Response<List<Post>>> = MutableLiveData()

    fun getPost(){
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value = response
        }
    }

    fun getPost2(number: Int) {
        viewModelScope.launch {
            val response = repository.getPost2(number)
            myResponse2.value = response
        }
    }

    fun getCuctomPosts(userId: Int, sort: String, order: String){
        viewModelScope.launch {
            val response = repository.getCuctomPosts(userId, sort, order)
            myCustomPosts.value = response
        }
    }

    fun getCuctomPosts2(userId: Int, options: Map<String, String>){
        viewModelScope.launch {
            val response = repository.getCuctomPosts2(userId, options)
            myCustomPosts2.value = response
        }
    }
}