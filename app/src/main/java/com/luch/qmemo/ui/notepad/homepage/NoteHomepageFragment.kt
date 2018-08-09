package com.luch.qmemo.ui.notepad.homepage

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.PagerSnapHelper
import android.widget.LinearLayout
import com.luch.qmemo.BaseFragment
import com.luch.qmemo.R
import kotlinx.android.synthetic.main.fragment_note_homepage.*

/**
 * @author: lh on 2018/8/8 17:04.
 * Email:luchefg@gmail.com
 * Description:
 */
class NoteHomepageFragment : BaseFragment(), NotePageContract.View {

    override lateinit var presenter: NotePageContract.Presenter


    override fun onResume() {
        super.onResume()
        presenter.start()
    }


    override fun loading() {
    }

    override fun OnitemClick() {
    }

    override fun attachLayoutRes(): Int {
        return R.layout.fragment_note_homepage
    }

    override fun initViews() {
        var layoutManager = LinearLayoutManager(activity as Context?)
        layoutManager.orientation = LinearLayout.HORIZONTAL
        rec_note.layoutManager = layoutManager
        var pagerSnapHelper = PagerSnapHelper()
        pagerSnapHelper.attachToRecyclerView(rec_note)
        var notes:ArrayList<String> = ArrayList()
        notes.add("个人随想")
        notes.add("旅游攻略")
        notes.add("生活记录")
        notes.add("工作心得")
        var homePageAdapter= HomePageAdapter(notes)
        rec_note.adapter = homePageAdapter

    }

    override fun updateViews(isRefresh: Boolean) {
    }


}
