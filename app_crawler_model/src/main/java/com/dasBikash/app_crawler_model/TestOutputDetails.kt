package com.dasBikash.app_crawler_model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class TestOutputDetails(
    val reportDirectory:String?,
    val testScriptPath:String?,
    val reportFileLocation:String?,
    val screenShotLocations:List<String>,
    val logFileLocation:String?,
    val error:Throwable?
):Parcelable