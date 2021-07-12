package com.dasBikash.app_crawler_model

/**
 * Async interfacce to monitor task status and to add success/failure callbacks
 * */
interface Task<T>{

    /***
     * Method to check weather subject task is complete or not
     *
     * @author Bikash Das(das.bikash.dev@gmail.com)
     */
    fun isComplete():Boolean

    /***
     * Method to check weather subject task is successFul or not
     *
     * @author Bikash Das(das.bikash.dev@gmail.com)
     */
    fun isSuccessFul():Boolean

    /***
     * Method to check weather subject task has failed or not
     *
     * @author Bikash Das(das.bikash.dev@gmail.com)
     */
    fun isFailure():Boolean

    /***
     * Method to register success calllbacks.
     * Callback must be registered before task completion. Will be ignored
     * if registered after task completion.
     *
     * @param task Functional parameter to be executed on task success.
     *
     *
     * @author Bikash Das(das.bikash.dev@gmail.com)
     */
    fun addOnSuccess(task:(T?)->Unit): Task<T>

    /***
     * Method to registed failure calllbacks
     * Callback must be registered before task completion. Will be ignored
     * if registered after task completion.
     *
     * @param task Functional parameter to be executed on task failure.
     *
     * @author Bikash Das(das.bikash.dev@gmail.com)
     */
    fun addOnFailure(onError:(Throwable?)->Unit): Task<T>
}