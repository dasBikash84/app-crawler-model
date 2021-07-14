package com.dasBikash.app_crawler_model

import android.view.View
import androidx.annotation.Keep


/**
 * Class to provide test settings during test launch
 *
 * @property testScriptPath `Remote/local(Private app storage)/assets` script path, if null given then
 *                          auto test will run
 * @property useFilesDirForReport for true report files will be saved in `files` directory else in `cache
 *                              directory of respective app's private storage
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
 * @property editTextIdsToIgnore List of `EditText` resource identifiers that are to be ignored and
 * no text input performed during auto(unscripted) test. A fully qualified resource identifier in the form of "package:type/entry"
 * has to be provided.
 *
 * @property editTextValueGeneratorsById A map of `resource id` to `input value generator function` to calculate input value for matching
 * `EditText` in auto test mode. `String` key has to be fully qualified resource identifier in the form of "package:type/entry" for target `Edittext`
 * and for map `value`, a generator function has to be provided, which will be called if ID match found during app crawler action, injecting
 * subject EditText as View and corresponding resource id as String parameters.
 *
 * Example param instance could be as below:
 *
 * ```
 *   editTextValueGeneratorsById = mapOf(
 *       "com.example.package_name:id/etQuery" to { view, resId -> "query_value"},
 *       "com.example.package_name:id/etData" to { view, resId -> "data_value"},
 *       "com.example.package_name:id/etUserName" to { view, resId -> "data_value"},
 *   )
 *```
 *
 * as `view` and `resource id` is injected into the generator function, input value of target
 * EditText can be calculated according to app state.
 *
 *
 * @property editTextValueGeneratorsByHint A map of `hint` to `input value generator function` to calculate input value for matching
 * `EditText` in auto test mode. `String` key is `hint` text of target `Edittext` and for map `value`, a generator function has to be provided,
 * which will be called if `hint` match found during app crawler action, injecting subject EditText as View and corresponding `hint` as
 * String parameters.
 *
 * Example param instance could be as below:
 *
 * ```
 *   editTextValueGeneratorsById = mapOf(
 *       "hint_query" to { view, resId -> "query_value"},
 *       "hint_Data" to { view, resId -> "data_value"},
 *       "hint_UserName" to { view, resId -> "data_value"},
 *   )
 *```
 *
 * as `view` and `hint` is injected into the generator function, input value of target
 * EditText can be calculated according to app state.
 *
 * For more example code please [`visit`](https://github.com/dasBikash84/app-crawler)
 *
 * */
@Keep
data class TestSettings(
    val testScriptPath:String?=null,
    val useFilesDirForReport:Boolean = false,
    val enableClickBlocker:Boolean = true,
    val maxRunTimeMinutes: Int = 5,
    val runOnlyScript: Boolean = false,
    val requestMethodFilter: RequestMethodFilter? = null,
    val defaultButtonResIdForDialog:String?=null,
    val editTextIdsToIgnore:List<String>? = null,
    val editTextValueGeneratorsById:Map<String,(View, String) -> String>? = null,
    val editTextValueGeneratorsByHint:Map<String,(View, String) -> String>? = null,
){
    companion object{
        const val MAX_TEST_RUN_TIME_MINUTES: Int = 120
    }
}