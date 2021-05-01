package com.bignerdranch.android.retrofitexample.model

/*

val userID: Int,
    val id: Int,
    val title: String,
    val body: String

val sex:Int,
    val patient_type:Int,
    val intubed:Int,
    val pneumonia:Int,
    val age:Int,
    val pregnancy:Int,
    val diabetes:Int,
    val copd:Int,
    val asthma:Int,
    val inmsupr:Int,
    val hypertension:Int,
    val other_disease:Int,
    val cardiovascular:Int,
    val obesity:Int,
    val renal_chronic:Int,
    val tobacco:Int,
    val contact_other_covid:Int,
    val icu:Int
 */
data class Post (
    val sex:Int,
    val patient_type:Int,
    val intubed:Int,
    val pneumonia:Int,
    val age:Int,
    val pregnancy:Int,
    val diabetes:Int,
    val copd:Int,
    val asthma:Int,
    val inmsupr:Int,
    val hypertension:Int,
    val other_disease:Int,
    val cardiovascular:Int,
    val obesity:Int,
    val renal_chronic:Int,
    val tobacco:Int,
    val contact_other_covid:Int,
    val icu:Int
)