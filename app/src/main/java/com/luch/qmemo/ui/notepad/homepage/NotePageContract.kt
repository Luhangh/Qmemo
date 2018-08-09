package com.luch.qmemo.ui.notepad.homepage

import com.example.android.architecture.blueprints.todoapp.BasePresenter
import com.example.android.architecture.blueprints.todoapp.BaseView

/**
 * @author: lh on 2018/8/8 17:30.
 * Email:luchefg@gmail.com
 * Description: This specifies the contract between the view and the presenter.
 */
interface NotePageContract{


    interface View : BaseView<Presenter> {

        fun loading()

        fun OnitemClick()

    }

    interface Presenter : BasePresenter{
        fun loadNoetTask()
    }
}
