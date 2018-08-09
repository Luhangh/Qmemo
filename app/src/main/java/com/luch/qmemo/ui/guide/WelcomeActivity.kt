package com.luch.qmemo.ui.guide

import android.content.Intent
import android.view.WindowManager
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import com.luch.qmemo.R
import com.luch.qmemo.base.BaseActivity
import com.luch.qmemo.ui.user.LoginActivity
import com.luch.qmemo.ui.TabFragmentActivity
import kotlinx.android.synthetic.main.activity_welcome.*

/**
 * $desc$ 欢迎页
 *
 * @Author mark 2285581945@qq.com
 * @Date 2018/8/3
 */
class WelcomeActivity : BaseActivity() {

    private var isLogin: Boolean = false
    private var isFirst: Boolean = true;

    override fun bundLayout(): Int {
        //设置全屏
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        return R.layout.activity_welcome
    }

    override fun initView() {
        var alphaAnimation: AlphaAnimation = AlphaAnimation(0.3f, 1.0f)
        alphaAnimation.duration = 3000
        alphaAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                startToactivity()
            }
        })

        img_welcome.startAnimation(alphaAnimation)
    }

    private fun startToactivity() {
        if (isFirst) {
            startActivity(Intent(this, LoadingActivity::class.java))
        } else {
            if (isLogin) {
                startActivity(Intent(this, TabFragmentActivity::class.java))
            } else {
                startActivity(Intent(this, LoginActivity::class.java))
            }
        }
        finish()
    }

    override fun initData() {

    }
}