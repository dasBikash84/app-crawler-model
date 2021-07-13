package com.dasBikash.app_crawler_model

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
 * @property maxRunTimeMinutes Maximum test run time in minutes (>=30 will be truncated to 30)
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
 * @property defaultEditTextIdValueMap a map of resource id to `default value`s for `EditText` in auto test mode.
 * `String` key has to be fully qualified resource identifier in the form of "package:type/entry" for `Edittext` and for map `value`,
 * value of intended input of `EditText`.
 *
 * @property defaultEditTextHintValueMap a map of `hint text` to `default value`s for `EditText` in auto test mode. For value input in
 * `EditText`, "resource id" matching will have higher priority than "hint". First "resource id" will be checked for map, if failed then "hint"
 * text will be checked.
 *
 * * */
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
    val defaultEditTextIdValueMap:Map<String,Any>? = null,
    val defaultEditTextHintValueMap:Map<String,Any>? = null
)