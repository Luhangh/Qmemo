package com.luch.qmemo.ui

import android.os.Bundle
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.support.v4.app.FragmentActivity
import com.luch.qmemo.R
import com.luch.qmemo.ui.fragment.ThreeFragment
import com.luch.qmemo.ui.fragment.TwoFragment
import com.luch.qmemo.ui.notepad.homepage.NoteHomepageFragment
import com.luch.qmemo.ui.notepad.homepage.NotePagePresenter
import kotlinx.android.synthetic.main.activity_tabfragment.*


/**
 * Creator lh on 2017/6/30 10:22.
 * Email:3021634343@qq.com
 * Description: 首页tab
 */

class TabFragmentActivity : FragmentActivity() {

    private var noteHomepageFragment: NoteHomepageFragment? = null
    private var two: TwoFragment? = null
    private var three: ThreeFragment? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabfragment)
        init()
        nav_bottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    fun init() {
        val fragmentTrans = supportFragmentManager.beginTransaction()
        noteHomepageFragment = NoteHomepageFragment()
        two = TwoFragment()
        three = ThreeFragment()
        fragmentTrans.add(R.id.lin_content, noteHomepageFragment)
        fragmentTrans.add(R.id.lin_content, two)
        fragmentTrans.add(R.id.lin_content, three)
        fragmentTrans.commit()
        NotePagePresenter(noteHomepageFragment!!)
    }


    private val mOnNavigationItemSelectedListener = OnNavigationItemSelectedListener { item ->

        when (item.itemId) {
            R.id.item_tab_one -> {
                supportFragmentManager.beginTransaction().show(noteHomepageFragment).hide(two).hide(three).commit()
                tv_bar_title.text = resources.getString(R.string.tab_one)
                return@OnNavigationItemSelectedListener true
            }
            R.id.item_tab_two -> {
                supportFragmentManager.beginTransaction().show(two).hide(noteHomepageFragment).hide(three).commit()
                tv_bar_title.text = resources.getString(R.string.tab_two)
                return@OnNavigationItemSelectedListener true
            }
            R.id.item_tab_three -> {
                supportFragmentManager.beginTransaction().show(three).hide(two).hide(noteHomepageFragment).commit()
                tv_bar_title.text = resources.getString(R.string.tab_three)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

}







