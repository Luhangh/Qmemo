package com.luch.qmemo.ui

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.luch.qmemo.R
import kotlinx.android.synthetic.main.activity_tabfragment.*

/**
 * Creator lh on 2017/6/30 10:22.
 * Email:3021634343@qq.com
 * Description: 首页tab
 */

class TabFragmentActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabfragment)
        init()
    }

    private fun init() {

        nav_bottom.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.item_tab_one -> {

                    return@setOnNavigationItemSelectedListener true
                }
                R.id.item_tab_two -> {

                    return@setOnNavigationItemSelectedListener true
                }
                R.id.item_tab_three -> {
                    var intent = Intent(this, SettingsActivity::class.java)
                    startActivity(intent)
                    return@setOnNavigationItemSelectedListener true
                }
                else -> {
                    false
                }
            }
        }

    }

}


