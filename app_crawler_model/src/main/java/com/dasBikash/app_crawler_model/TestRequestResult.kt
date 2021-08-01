package com.dasBikash.app_crawler_model

import androidx.annotation.Keep

/**
 * Class for test request result
 *
 * @property sessionId Test session unique id
 * @property validRequest will be true if valid settings else false
 * @property causeOfFailure if test launch fails then cause string else null
 *
 * @author Bikash Das(das.bikash.dev@gmail.com)
 * */
@Keep
data class TestRequestResult(
    val sessionId:Long,
    val validRequest:Boolean,
    val causeOfFailure:String?
)