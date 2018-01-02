package com.mataharimall.mmandroid.presentation.login

import com.mataharimall.mmandroid.presentation.BasePresenter
import com.mataharimall.mmandroid.presentation.BaseView

/**
 * Created by adrie_savana on 12/28/17.
 */
interface LoginMvp {

    interface View : BaseView<LoginMvp.Presenter> {

    }

    interface Presenter : BasePresenter {
        fun login(email: String, password: String)
    }

}