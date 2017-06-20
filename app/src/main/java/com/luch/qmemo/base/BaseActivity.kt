package com.luch.qmemo.base

import android.app.Activity
import android.os.Bundle

import com.luch.qmemo.utils.AppManager

/**
 * Creator lh on 2017/6/20 11:42.
 * Email:3021634343@qq.com
 * Description:
 */

abstract class BaseActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bundLayout())
        AppManager.getAppManager().addActivity(this)
        initView()
        initData()
    }

    protected abstract fun bundLayout(): Int

    protected abstract fun initView(): Int

    protected abstract fun initData(): Int


    override fun onDestroy() {
        AppManager.getAppManager().finishActivity(this)
        super.onDestroy()
    }
}
