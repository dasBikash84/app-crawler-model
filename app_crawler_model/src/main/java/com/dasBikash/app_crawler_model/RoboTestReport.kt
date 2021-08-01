package com.dasBikash.app_crawler_model

import androidx.annotation.Keep
import com.dasBikash.app_crawler_model.NetworkRequestDetails
import com.dasBikash.app_crawler_model.RoboActionDetail
import java.util.*
@Keep
data class RoboTestReport(
    val packageName:String,
    val testScriptPaths:String?,
    val testStartTime: Date,
    val testEndTime: Date?,
    val testActionCountOnScript:Int,
    val successfulScriptTestActionCount:Int,
    val successfulRoboTestActionCount:Int,
    val networkRequestDetails:List<NetworkRequestDetails>,
    val screenShotLocations:List<String>,
    val logFilePath:String?,
    val testCompletionStatus:String,
    val exceptionClass: String?,
    val errorMessage:String?,
    val stackTrace:String?,
    val roboActionDetails:List<RoboActionDetail>,
    val testSessionId:Long
)