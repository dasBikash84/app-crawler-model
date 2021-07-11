package com.dasBikash.app_crawler_model

interface Task<T>{
    fun isComplete():Boolean
    fun isSuccessFul():Boolean
    fun isFailure():Boolean
    fun addOnSuccess(task:(T?)->Unit): Task<T>
    fun addOnFailure(onError:(Throwable?)->Unit): Task<T>
}