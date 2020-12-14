package com.concatadapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PlaygroundAdapter(val list: List<Items>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }

}