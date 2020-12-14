package com.concatadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.concatadapter.R.*

class CarsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_LIST) {
            ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(layout.item_cars, parent, false)
            )
        } else {
            ViewHolder(
                LayoutInflater.from(parent.context).inflate(layout.item_header, parent, false)
            ).apply {
                this.itemView.findViewById<TextView>(R.id.txt_header).text = "HEADER 2"
            }
        }
    }

    override fun getItemCount() = 3

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) VIEW_TYPE_HEADER else VIEW_TYPE_LIST
    }

    companion object {
        const val VIEW_TYPE_HEADER = 0
        const val VIEW_TYPE_LIST = 1
    }
}