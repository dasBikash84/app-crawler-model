package com.dasBikash.app_crawler_model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

/**
 *  Class containing info of generated test reports regarding last completed robo test
 *
 *  @property reportDirectory Path to directory containing generated test reports
 *  @property testScriptPaths Comma separated test script paths if provided else null
 *  @property reportFileLocation location of generated json test report relative to `reportDirectory`
 *  @property screenShotLocations location of screen-shot files relative to `reportDirectory`
 *  @property logFileLocation location of `logcat` file relative to `reportDirectory`
 *  @property error if test exits due to any exception
 *
 * @author Bikash Das(das.bikash.dev@gmail.com)
 * */
@Keep
@Parcelize
data class TestOutputDetails(
    val reportDirectory:String?,
    val testScriptPaths:String?,
    val reportFileLocation:String?,
    val screenShotLocations:List<String>,
    val logFileLocation:String?,
    val error:Throwable?
):Parcelable