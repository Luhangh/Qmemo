package com.luch.qmemo

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by long on 2016/5/31.
 * 碎片基类
 */
abstract class BaseFragment : Fragment() {


    protected var mContext: Context? = null

    //缓存Fragment view
    private var mRootView: View? = null
    private var mIsMulti = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = activity
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        if (mRootView == null) {
            mRootView = inflater.inflate(attachLayoutRes(), null)
            initViews()

        }
        val parent = mRootView!!.parent as ViewGroup
        parent?.removeView(mRootView)
        return mRootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (userVisibleHint && mRootView != null && !mIsMulti) {
            mIsMulti = true
            updateViews(false)
        }
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        if (isVisibleToUser && isVisible && mRootView != null && !mIsMulti) {
            mIsMulti = true
            updateViews(false)
        } else {
            super.setUserVisibleHint(isVisibleToUser)
        }
    }

    fun showStrError() {

    }

    fun showMsg(msg: String) {

    }


    override fun onDestroy() {
        super.onDestroy()
    }

    /**
     * 绑定布局文件
     *
     * @return 布局文件ID
     */
    protected abstract fun attachLayoutRes(): Int


    /**
     * 初始化视图控件
     */
    protected abstract fun initViews()

    /**
     * 更新视图控件
     *
     * @param isRefresh 新增参数，用来判断是否为下拉刷新调用，下拉刷新的时候不应该再显示加载界面和异常界面
     */
    protected abstract fun updateViews(isRefresh: Boolean)

}
