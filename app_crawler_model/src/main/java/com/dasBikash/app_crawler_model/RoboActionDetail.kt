package com.dasBikash.app_crawler_model

import androidx.annotation.Keep
import java.util.*

@Keep
data class RoboActionDetail(
    val actionIndex:Int,
    val eventType: String?,
    var className: String?,
    val parentActivityClassName: String?,
    val parentFragmentClass:String?,
    val contentDescription: String? = null,
    val resourceName: String? = null,
    val text: String? = null,
    val isAutoCrawlerAction:Boolean = false,
    val eventTime: Date = Date()
)