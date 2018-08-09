package com.luch.qmemo.ui.notepad.homepage

import com.example.android.architecture.blueprints.todoapp.BasePresenter
import com.example.android.architecture.blueprints.todoapp.BaseView

/**
 * @author: lh on 2018/8/8 17:30.
 * Email:luchefg@gmail.com
 * Description: Listens to user actions from the UI ([NoteHomepageFragment]), retrieves the data and updates
 * the UI as required.
 */
class NotePagePresenter(val view: NotePageContract.View) : NotePageContract.Presenter {

    //加载笔记本
    override fun loadNoetTask() {

    }

    override fun start() {

    }

    init {
        view.presenter = this
    }

    interface View : BaseView<NotePageContract.Presenter> {

    }

    interface Presenter : BasePresenter {

    }

}
