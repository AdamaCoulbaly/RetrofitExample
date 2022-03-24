package com.revature.retrofitexample.network

import com.google.gson.annotations.SerializedName
import java.time.LocalDate


//This data class is for the Request
data class postJob(
    @SerializedName("jobImage")
    val jobImage:Int,

    @SerializedName("jobDescription")
    val jobDescription:String,

    @SerializedName("jobSkill")
    val jobSkill:String,

    @SerializedName("certfitication")
    val certfitication:String,

    @SerializedName("address")
    val address:String,

    @SerializedName("rate")
    val rate:String,

    @SerializedName("availability")
    var availability:LocalDate

)
