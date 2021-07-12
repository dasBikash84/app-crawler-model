package com.dasBikash.app_crawler_model

import androidx.annotation.Keep

/**
 *  Filter class which is to be used in conjunction with network interceptor to
 *  filer network request based on whitelisted `HttpMethod` and `whiteListedUrls`.
 *
 *  @property allowedMethods List of `HttpMethod` to eanble network request by HttpMethod.
 *  Unless url(part) is whiteListed explicitly, requests of allowed method types will only succeed.
 *
 *  @property whiteListedUrls list of parts of whiteListed urls. Request will be allowed if part
 *  of it's URL is add on whiteListedUrls regardless of method type.
 *
 *  @see [HttpMethod]](https://github.com/dasBikash84/app-crawler-model/blob/master/app_crawler_model/src/main/java/com/dasBikash/app_crawler_model/HttpMethod.kt)
 *
 * @author Bikash Das(das.bikash.dev@gmail.com)
 * */
@Keep
data class RequestMethodFilter(
    val allowedMethods:List<HttpMethod>,
    val whiteListedUrls:List<String>?=null
){
    companion object{
        /**
         * Method to get `RequestMethodFilter` instance only to allow `GET` requests.
         *
         * @param whiteListedUrls url(full/parts) list to allow requests irrespective of request method type
         *
         * @author Bikash Das(das.bikash.dev@gmail.com)
         * */
        fun methodGetFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET),
                whiteListedUrls
            )


        /**
         * Method to get `RequestMethodFilter` instance only to allow `GET` & `POST` requests.
         *
         * @param whiteListedUrls url(full/parts) list to allow requests irrespective of request method type
         *
         * @author Bikash Das(das.bikash.dev@gmail.com)
         * */
        fun methodGetPostFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET, HttpMethod.POST),
                whiteListedUrls
            )

        /**
         * Method to get `RequestMethodFilter` instance only to allow `GET` & `PUT` requests.
         *
         * @param whiteListedUrls url(full/parts) list to allow requests irrespective of request method type
         *
         * @author Bikash Das(das.bikash.dev@gmail.com)
         * */
        fun methodGetPutFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET, HttpMethod.PUT),
                whiteListedUrls
            )

        /**
         * Method to get `RequestMethodFilter` instance only to allow `GET` & `PATCH` requests.
         *
         * @param whiteListedUrls url(full/parts) list to allow requests irrespective of request method type
         *
         * @author Bikash Das(das.bikash.dev@gmail.com)
         * */
        fun methodGetPatchFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET, HttpMethod.PATCH),
                whiteListedUrls
            )

        /**
         * Method to get `RequestMethodFilter` instance only to allow `GET` & `DELETE` requests.
         *
         * @param whiteListedUrls url(full/parts) list to allow requests irrespective of request method type
         *
         * @author Bikash Das(das.bikash.dev@gmail.com)
         * */
        fun methodGetDeleteFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET, HttpMethod.DELETE),
                whiteListedUrls
            )

        /**
         * Method to get `RequestMethodFilter` instance only to allow `GET`, `POST` & `DELETE` requests.
         *
         * @param whiteListedUrls url(full/parts) list to allow requests irrespective of request method type
         *
         * @author Bikash Das(das.bikash.dev@gmail.com)
         * */
        fun methodGetPostDeleteFilter(
            whiteListedUrls:List<String> = emptyList()
        ): RequestMethodFilter =
            RequestMethodFilter(
                listOf(HttpMethod.GET, HttpMethod.POST,HttpMethod.DELETE),
                whiteListedUrls
            )
    }
}