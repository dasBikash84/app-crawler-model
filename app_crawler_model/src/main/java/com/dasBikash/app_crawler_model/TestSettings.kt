package com.dasBikash.app_crawler_model

import android.app.Activity
import android.view.View
import androidx.annotation.Keep
import androidx.fragment.app.Fragment
import java.util.*


/**
 * Class to provide test settings during test launch
 *
 * @property testSessionId Unique test session ID. For duplicate ids, test requests will be ignored.
 *
 * @property testScriptPaths List of `Remote/local(Private app storage)/assets` script paths, if null given then
 *                          auto test will run
 *
 * @property enableClickBlocker if true all touch events will be blocked during test
 *
 * @property maxRunTimeMinutes Maximum test run time in minutes (>=120 will be truncated to 120)
 *
 * @property runOnlyScript whether to run only script or run unscripted robo test
 *                          also, at the end of scripted action execution.
 *
 * @property requestMethodFilter optional RequestMethodFilter instance to restrict specific api calls
 *  [see also](https://github.com/dasBikash84/app-crawler-model/blob/master/app_crawler_model/src/main/java/com/dasBikash/app_crawler_model/RequestMethodFilter.kt)
 *
 * - To allow only `GET` api calls => `RequestMethodFilter.methodGetFilter()`
 * - To allow only `GET` and any other api containing '/login' in path =>
 *      RequestMethodFilter.methodGetFilter(listOf("/login"))
 * - To allow only `GET` and `POST` api calls => RequestMethodFilter.methodGetPostFilter()
 * - To allow only `GET` , `POST` and `DELETE` api calls => RequestMethodFilter.methodGetPostDeleteFilter()
 *
 * ### With `null` RequestMethodFilter no api call will be restricted.
 *
 * @property idsToIgnoreInAutoCrawling List of `View` resource identifiers that are to be ignored and
 * no action to be performed on those during auto(unscripted) test. A fully qualified resource identifier in the form of "package:type/entry"
 * has to be provided.
 *
 * @property idsForManualActionInAutoCrawling List of `View` resource identifiers for which registered
 * handler will be called in auto crawling mode. A fully qualified resource identifier in the form of "package:type/entry"
 * has to be provided.
 *
 * @property editTextValueMap A map of `resource id` to `value` to calculate input value for matching
 * `EditText` views. `String` key has to be fully qualified resource identifier in the form of "package:type/entry" for target `EditText`.
 *
 * Example param instance could be as below:
 *
 * ```
 *   editTextValueMap = mapOf(
 *       "com.example.package_name:id/etUserName" to "habul@example.com",
 *       "com.example.package_name:id/etPassword" to "habul1234",
 *       "com.example.package_name:id/etPhone" to "01555123456",
 *   )
 *```
 *
 * For more example code please [`visit`](https://github.com/dasBikash84/app-crawler)
 *
 * */
@Keep
data class TestSettings(
    val testSessionId:Long = System.nanoTime(),
    val testScriptPaths:List<String>?=null,
    val enableClickBlocker:Boolean = true,
    val maxRunTimeMinutes: Int = DEFAULT_TEST_RUN_TIME_MINUTES,
    val runOnlyScript: Boolean = false,
    val requestMethodFilter: RequestMethodFilter? = null,
    val editTextValueMap:Map<String,String>? = null,
    val idsToIgnoreInAutoCrawling:List<String>? = null,
    val idsForManualActionInAutoCrawling:List<String>? = null
){
    constructor(
        testSessionId:Long = System.nanoTime(),
        testScriptPath:String,
        enableClickBlocker:Boolean = true,
        maxRunTimeMinutes: Int = DEFAULT_TEST_RUN_TIME_MINUTES,
        runOnlyScript: Boolean = false,
        requestMethodFilter: RequestMethodFilter? = null,
        editTextValueMap:Map<String,String>? = null,
        idsToIgnoreInAutoCrawling:List<String>? = null,
        idsForManualActionInAutoCrawling:List<String>? = null
    ):this(
        testSessionId = testSessionId,
        testScriptPaths = listOf(testScriptPath),
        enableClickBlocker = enableClickBlocker,
        maxRunTimeMinutes = maxRunTimeMinutes,
        runOnlyScript = runOnlyScript,
        requestMethodFilter = requestMethodFilter,
        editTextValueMap = editTextValueMap,
        idsToIgnoreInAutoCrawling = idsToIgnoreInAutoCrawling,
        idsForManualActionInAutoCrawling = idsForManualActionInAutoCrawling
    )

    companion object{
        const val DEFAULT_TEST_RUN_TIME_MINUTES: Int = 5
        const val MAX_TEST_RUN_TIME_MINUTES: Int = 120
    }
}