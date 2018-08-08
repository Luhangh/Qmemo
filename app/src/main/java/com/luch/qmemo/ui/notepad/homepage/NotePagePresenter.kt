package com.luch.qmemo.ui.notepad.homepage

import android.os.Parcel
import android.os.Parcelable
import com.example.android.architecture.blueprints.todoapp.BasePresenter
import com.example.android.architecture.blueprints.todoapp.BaseView

/**
 * @author: lh on 2018/8/8 17:30.
 * Email:luchefg@gmail.com
 * Description: Listens to user actions from the UI ([NoteHomepageFragment]), retrieves the data and updates
 * the UI as required.
 */
interface NotePagePresenter(val view: NotePageContract.View) :NotePageContract.Presenter {

    init {
        view.presenter = this
    }
    interface View : BaseView<Presenter> {

    }

    interface Presenter : BasePresenter{

    }

}
