package com.dasBikash.app_crawler_model

import androidx.annotation.Keep


/**
 * specify values for edit text by resource id.
 * specify edit texts that are not to be touched.
 * Default resource id to click on pop up.
 * Specify whether to enable curtion or not.
 * move url filter to config.
 * move current params (path,max time, onlyScript) to config.
 * specify whether to use personal app space for reports, default will be cache.
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
    val defaultEditTextIdValueMap:Map<String,Any>? = null,
    val defaultEditTextHintValueMap:Map<String,Any>? = null
)