package com.example.log.presenter

@FunctionalInterface
interface LoginPresenter {
    fun doLogin(userName: String, password: String)
}