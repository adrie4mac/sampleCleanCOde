package com.mataharimall.mmandroid.presentation.login

import javax.inject.Inject

/**
 * Created by adrie_savana on 1/2/18.
 */
class LoginPresenter @Inject constructor(val view: LoginMvp.View): LoginMvp.Presenter {

    init {
        view.setPresenter(this)
    }

    override fun login(email: String, password: String) {

    }

    //inner class LoginSubscriber: DisposableSingleObserver<>
}