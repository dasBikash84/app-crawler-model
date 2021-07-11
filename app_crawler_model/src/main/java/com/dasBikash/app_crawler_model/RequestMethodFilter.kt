package com.dasBikash.app_crawler_model

import androidx.annotation.Keep

@Keep
data class RequestMethodFilter(
    val allowedMethods:List<HttpMethod>,
    val whiteListedUrls:List<String>?=null
){
    companion object{
        fun methodGetFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET),
                whiteListedUrls
            )

        fun methodGetPostFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET, HttpMethod.POST),
                whiteListedUrls
            )

        fun methodGetPutFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET, HttpMethod.PUT),
                whiteListedUrls
            )

        fun methodGetPatchFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET, HttpMethod.PATCH),
                whiteListedUrls
            )

        fun methodGetDeleteFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET, HttpMethod.DELETE),
                whiteListedUrls
            )

        fun methodGetPostDeleteFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET, HttpMethod.POST,HttpMethod.DELETE),
                whiteListedUrls
            )
    }
}