package com.example.log.view.listener

interface LoginResultListener {

    fun onSuccess(result: String)

    fun onFail(errorMessage: String)
}