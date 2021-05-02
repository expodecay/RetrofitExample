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
                Log.d("sex Response", response.body()?.sex.toString())
                Log.d("patient_type Response", response.body()?.patient_type.toString())
                Log.d("intubed Response", response.body()?.intubed.toString())
                Log.d("pneumonia Response", response.body()?.pneumonia.toString())
                Log.d("age Response", response.body()?.age.toString())
                Log.d("pregnancy Response", response.body()?.pregnancy.toString())
                Log.d("diabetes Response", response.body()?.diabetes.toString())
                Log.d("copd Response", response.body()?.copd.toString())
                Log.d("asthma Response", response.body()?.asthma.toString())
                Log.d("inmsupr Response", response.body()?.inmsupr.toString())
                Log.d("hypertension Response", response.body()?.hypertension.toString())
                Log.d("other_disease Response", response.body()?.other_disease.toString())
                Log.d("cardiovascular Response", response.body()?.cardiovascular.toString())
                Log.d("obesity Response", response.body()?.obesity.toString())
                Log.d("renal_chronic Response", response.body()?.renal_chronic.toString())
                Log.d("tobacco Response", response.body()?.tobacco.toString())
                Log.d("contact_other Response", response.body()?.contact_other_covid.toString())
                Log.d("icu Response", response.body()?.icu.toString())

                textView.text = "age: " + response.body()?.age.toString()

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