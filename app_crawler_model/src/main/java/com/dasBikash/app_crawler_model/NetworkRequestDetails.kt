package com.dasBikash.app_crawler_model

import androidx.annotation.Keep
import java.util.*

@Keep
data class NetworkRequestDetails(
    val url:String,
    val method:String,
    val requestHeaders:List<Pair<String,String?>>,
    val requestBody:String?,
    val responseHeaders:List<Pair<String,String?>>,
    val responseBody:String?,
    val statusCode:Int,
    val time: Date = Date()
)