package com.luch.qmemo.ui.fragment

import com.luch.qmemo.R
import com.luch.qmemo.base.BaseActivity
import kotlinx.android.synthetic.main.fragment_index.*

/**
 * Creator lh on 2017/9/11 16:02.
 * Email:3021634343@qq.com
 * Description:
 */

class IndexFragment : BaseActivity(){
    override fun bundLayout(): Int {
        return R.layout.fragment_index

    }

    override fun initView() {
        bar_title.setTitle("首页资讯")
        setSupportActionBar(bar_title)

    }

    override fun initData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}