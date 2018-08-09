package com.luch.qmemo.ui.notepad.homepage

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.luch.qmemo.R
import kotlinx.android.synthetic.main.item_note_page.view.*

/**
 * @author: lh on 2018/8/9 11:46.
 * Email:luchefg@gmail.com
 * Description:
 */
class HomePageAdapter(var notes: ArrayList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder? {
        return HomePageHolder(LayoutInflater.from(parent!!.context).inflate(R.layout
                .item_note_page, parent, false))
    }

    override fun getItemCount(): Int {
        return notes?.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        holder!!.itemView.tx_note_num.text = notes[position]

    }

    class HomePageHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
