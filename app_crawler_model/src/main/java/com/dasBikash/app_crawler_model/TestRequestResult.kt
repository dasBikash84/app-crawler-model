package com.dasBikash.app_crawler_model

import androidx.annotation.Keep

/**
 * Class for test request result
 *
 * @property testLaunched will be true if test launched else false
 * @property causeOfFailure if test launch fails then cause string else null
 *
 * @author Bikash Das(das.bikash.dev@gmail.com)
 * */
@Keep
data class TestRequestResult(
    val testLaunched:Boolean,
    val causeOfFailure:String?
)