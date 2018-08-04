package com.luch.qmemo.adaper

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

/**
 * $desc$
 *
 * @Author mark 2285581945@qq.com
 * @Date 2018/8/3
 */
class ViewPagerAdapter(var context:Context,var imgs:List<Int>) : PagerAdapter() {


    /**
     * 判断是否是否为同一张图片，这里返回方法中的两个参数做比较就可以
     * */
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return imgs.size
    }

    /**
     * 设置viewpage内部东西的方法，如果viewpage内没有子空间滑动产生不了动画效果
     * */
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var img:ImageView = ImageView(context)
        img.setImageResource(imgs.get(position))
        img.scaleType = ImageView.ScaleType.FIT_XY
        container.addView(img)
        return img
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}