package com.bignerdranch.android.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bignerdranch.android.retrofitexample.repository.Repository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer {response ->

            /*
            if(response.isSuccessful){
                Log.d("Response", response.body()?.userID.toString())
                Log.d("Response", response.body()?.id.toString())
                Log.d("Response", response.body()?.title!!)
                textView.text = response.body()?.title!!
                Log.d("Response", response.body()?.body!!)
            }else{
                Log.d("response", response.errorBody().toString())
                textView.text = response.code().toString()
            }

             */


            if(response.isSuccessful){

                textView.text = response.body()?.age.toString()

            }else{
                Log.d("response", response.errorBody().toString())
                textView.text = response.code().toString()
            }

            /*
            Log.d("Response", response.sex.toString())
            Log.d("Response", response.patient_type.toString())
            Log.d("Response", response.intubed.toString())
            Log.d("Response", response.pneumonia.toString())
            Log.d("Response", response.age.toString())
            Log.d("Response", response.pregnancy.toString())
            Log.d("Response", response.diabetes.toString())
            Log.d("Response", response.copd.toString())
            Log.d("Response", response.asthma.toString())
            Log.d("Response", response.inmsupr.toString())
            Log.d("Response", response.hypertension.toString())
            Log.d("Response", response.other_disease.toString())
            Log.d("Response", response.cardiovascular.toString())
            Log.d("Response", response.obesity.toString())
            Log.d("Response", response.renal_chronic.toString())
            Log.d("Response", response.tobacco.toString())
            Log.d("Response", response.contact_other_covid.toString())
            Log.d("Response", response.icu.toString())

             */
        })
    }
}