package com.luch.qmemo.base

import android.app.Application
import android.database.sqlite.SQLiteDatabase
import com.luch.qmemo.greedao.DaoMaster
import com.luch.qmemo.greedao.DaoSession


/**
 * Creator lh on 2017/6/20 11:30.
 * Email:3021634343@qq.com
 * Description:
 */

class QmeAppliption : Application() {


    private val isDug = false

    private var mHelper: DaoMaster.DevOpenHelper? = null
    private var db: SQLiteDatabase? = null
    private var mDaoMaster: DaoMaster? = null
    private var mDaoSession: DaoSession? = null


    override fun onCreate() {
        super.onCreate()
    }

    private fun setDatabase() {
        mHelper = DaoMaster.DevOpenHelper(this, "sport-db", null)
        db = mHelper!!.writableDatabase
        mDaoMaster = DaoMaster(db)
        mDaoSession = mDaoMaster!!.newSession()

    }


    fun getDaoSession(): DaoSession? {
        return this!!.mDaoSession
    }

    fun getDb(): SQLiteDatabase? {
        return this!!.db
    }


}