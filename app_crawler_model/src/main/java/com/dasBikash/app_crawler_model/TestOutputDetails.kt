package com.dasBikash.app_crawler_model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

/**
 *  Class containing info of generated test reports regarding last completed robo test
 *
 *  @property sessionId Test session unique id
 *  @property reportDirectory Path to directory containing generated test reports
 *  @property error if test exits due to any exception
 *
 * @author Bikash Das(das.bikash.dev@gmail.com)
 * */
@Keep
@Parcelize
data class TestOutputDetails(
    val sessionId:Long,
    val reportDirectory:String?,
    val error:Throwable?
):Parcelable