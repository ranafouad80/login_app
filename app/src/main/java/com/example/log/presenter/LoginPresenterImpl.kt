package com.example.log.presenter

import android.text.TextUtils
import com.example.log.model.LoginModel
import com.example.log.view.listener.LoginResultListener

class LoginPresenterImpl(private val loginResultListener: LoginResultListener) : LoginPresenter {

    private val loginModel: LoginModel = LoginModel()

    override fun doLogin(userName: String, password: String) {
        return if (TextUtils.isEmpty(userName)) {
            loginResultListener.onFail("Please provide user name")
        } else if (TextUtils.isEmpty(password)) {
            loginResultListener.onFail("Please provide password name")
        } else {
            if (loginModel.doLogin(userName, password)) {
                loginResultListener.onSuccess("Successfully logged in")
            } else {
                loginResultListener.onFail("Please provide correct credentials")
            }
        }

    }
}