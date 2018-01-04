package com.luch.qmemo.ui

import android.app.Fragment
import android.app.FragmentManager
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.widget.LinearLayout
import com.luch.qmemo.R
import com.luch.qmemo.ui.fragment.IndexFragment
import kotlinx.android.synthetic.main.activity_tabfragment.*
import android.support.annotation.NonNull
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.support.v4.app.FragmentTransaction
import android.view.MenuItem


/**
 * Creator lh on 2017/6/30 10:22.
 * Email:3021634343@qq.com
 * Description: 首页tab
 */

class TabFragmentActivity : FragmentActivity() {

    private var fm: FragmentManager? = this.fragmentManager
    private var index :IndexFragment? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabfragment)
        nav_bottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }



    private val mOnNavigationItemSelectedListener
            = OnNavigationItemSelectedListener { item ->
        val ft = supportFragmentManager.beginTransaction()
        when (item.itemId) {
            R.id.item_tab_one -> {
                if (index ==null){
                    index = IndexFragment()
                    ft.add(R.id.lin_content,index)
                }

                return@OnNavigationItemSelectedListener true
            }
            R.id.item_tab_two -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.item_tab_three -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

}







