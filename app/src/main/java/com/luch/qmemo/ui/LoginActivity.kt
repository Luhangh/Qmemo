package com.luch.qmemo.ui

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.content.Intent
import android.os.AsyncTask
import android.os.Build
import android.text.TextUtils
import android.view.View
import android.view.animation.AnimationUtils
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.luch.qmemo.R
import com.luch.qmemo.base.BaseActivity

/**
 * A login screen that offers login via email/password.
 */
class LoginActivity : BaseActivity() {

    private var mUser: EditText? = null
    private var mPwd: EditText? = null
    private var mLogo: ImageView? = null
    private var mLogin: Button? = null
    private var mAuthTask: LoginActivity.UserLoginTask? = null

    override fun bundLayout(): Int {
        return R.layout.activity_login
    }

    @SuppressLint("WrongViewCast")
    override fun initView() {
        mUser = findViewById<EditText>(R.id.email)
        mPwd = findViewById<EditText>(R.id.password)
        mLogo = findViewById<ImageView>(R.id.img_logo)
        mLogo!!.setOnClickListener { startAnim() }
        mLogin = findViewById<Button>(R.id.email_sign_in_button)
        mLogin!!.setOnClickListener { attemptLogin() }
        mPwd!!.setOnEditorActionListener(TextView.OnEditorActionListener { textView, id, keyEvent ->
            if (id == R.id.login || id == EditorInfo.IME_NULL) {
                attemptLogin()
                return@OnEditorActionListener true
            }
            false
        })
    }

    private fun startAnim() {
        val anim = AnimationUtils.loadAnimation(this, R.anim.blink)
        mLogo!!.startAnimation(anim)
    }

    override fun initData() {
        startAnim()
    }


    private fun attemptLogin() {

        // Reset errors.
        mUser!!.error = null
        mPwd!!.error = null

        // Store values at the time of the login attempt.
        val email = mUser!!.text.toString()
        val password = mPwd!!.text.toString()

        var cancel = false
        var focusView: View? = null

        if (!TextUtils.isEmpty(password) || !isPasswordValid(password)) {
            mPwd!!.error = getString(R.string.error_invalid_password)
            focusView = mPwd
            cancel = true
        }

        if (TextUtils.isEmpty(email)) {
            mUser!!.error = getString(R.string.error_invalid_user)
            focusView = mUser
            cancel = true
        } else {
            if (!isUser(email)) {
                mUser!!.error = getString(R.string.error_incorrect__user)
                focusView = mUser
                cancel = true
            }
        }

        if (cancel) {
            focusView!!.requestFocus()
        } else {
            showProgress(true)
            mAuthTask = UserLoginTask(email, password)
            mAuthTask!!.execute()
        }
    }

    /**
     * Shows the progress UI and hides the login form.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private fun showProgress(show: Boolean) {

    }

    private fun isUser(user: String): Boolean {
        //TODO: Replace this with your own logic
        return user.length > 1
    }

    private fun isPasswordValid(password: String): Boolean {
        //TODO: Replace this with your own logic
        return password.length > 1
    }

    inner class UserLoginTask internal constructor(private val mEmail: String, private val mPassword: String) : AsyncTask<String, Int, Boolean>() {

        override fun doInBackground(vararg params: String?): Boolean {
            try {
                Thread.sleep(1000)
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return true
        }

        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)

            if (result!!) {
               var intent = Intent(this@LoginActivity,TabFragmentActivity::class.java)
                startActivity(intent)
            }

        }
    }
}

