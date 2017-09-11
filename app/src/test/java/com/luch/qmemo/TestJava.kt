package com.luch.qmemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.luch.qmemo.ui.TabFragmentActivity

/**
 * Creator lh on 2017/9/11 11:54.
 * Email:3021634343@qq.com
 * Description:
 */

class TestJava : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, TabFragmentActivity::class.java)
        startActivity(intent)
    }
}
