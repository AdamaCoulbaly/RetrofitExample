package com.revature.retrofitexample.network

import com.google.gson.annotations.SerializedName


//This class is for the Response
data class token(
    @SerializedName("sucess_message")
    val sucess_message:String,

    @SerializedName("job_id")
    val job_id:String
)
