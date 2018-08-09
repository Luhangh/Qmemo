package com.luch.qmemo.ui.guide

import android.content.Intent
import android.support.v4.view.ViewPager
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import com.luch.qmemo.R
import com.luch.qmemo.adaper.ViewPagerAdapter
import com.luch.qmemo.base.BaseActivity
import com.luch.qmemo.ui.user.LoginActivity
import kotlinx.android.synthetic.main.activity_loading_layout.*

/**
 * $desc$ 引导页
 *
 * @Author mark 2285581945@qq.com
 * @Date 2018/8/3
 */
class LoadingActivity : BaseActivity(), View.OnClickListener {

    //引导图片资源
    private var pics: List<Int> = listOf(R.mipmap.guide_one, R.mipmap.guide_two, R.mipmap.guide_three)

    //底部小店图片
    private var dots: Array<ImageView>? = null

    //记录当前选中位置
    private var currentIndex: Int = 0

    private var vAdapter: ViewPagerAdapter? = null

    override fun bundLayout(): Int {
        //设置全屏
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        return R.layout.activity_loading_layout
    }

    override fun initView() {

        vAdapter = ViewPagerAdapter(this, pics)
        viewpager.adapter = vAdapter
        viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                currentIndex = position
                if (position == 2) {
                    loading_tiyan_btn.visibility = View.VISIBLE
                } else {
                    loading_tiyan_btn.visibility = View.INVISIBLE
                }

                initDots()
            }

        })
        //跳转登陆
        loading_tiyan_btn.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        btn_skip.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    override fun initData() {
        var img1:ImageView = ll.getChildAt(0) as ImageView
        var img2:ImageView = ll.getChildAt(1) as ImageView
        var img3:ImageView = ll.getChildAt(2) as ImageView
        img1.setOnClickListener(this)
        img2.setOnClickListener(this)
        img3.setOnClickListener(this)
        dots = arrayOf(img1,img2,img3)
        initDots()
    }

    private fun initDots() {
        for (item in pics.indices){
            dots!![item].isSelected  = false
        }
        dots!![currentIndex].isSelected = true

    }

    override fun onClick(v: View?) {
        when(v){
            dots!![0] -> currentIndex = 0
            dots!![1] -> currentIndex = 1
            dots!![2] -> currentIndex = 2
            else -> currentIndex
        }
        initDots()
        viewpager.currentItem = currentIndex
    }
}