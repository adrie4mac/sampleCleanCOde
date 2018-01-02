package com.mataharimall.mmandroid.ui.module.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.mataharimall.mmandroid.presentation.login.LoginMvp
import com.mataharimall.mmandroid.ui.R
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

/**
 * Created by adrie_savana on 12/29/17.
 */
class LoginActivity: AppCompatActivity(), LoginMvp.View {

    @Inject lateinit var onboardingPresenter: LoginMvp.Presenter

    override fun setPresenter(presenter: LoginMvp.Presenter) {
        onboardingPresenter = presenter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        AndroidInjection.inject(this)

        btn_login_button.setOnClickListener(View.OnClickListener {
            onboardingPresenter.login(
                    edt_email.editableText.toString(),
                    edt_password.editableText.toString()
            )
        })
    }
}