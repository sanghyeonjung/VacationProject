package com.example.vacationproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*
import java.util.*

class RecyclerViewAdapter(private val items: ArrayList<DataScoreBoard>):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()
{
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            fun onBind(item : DataScoreBoard) {

            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.onBind(items[position])
        }

        override fun getItemCount(): Int = items.size
}
