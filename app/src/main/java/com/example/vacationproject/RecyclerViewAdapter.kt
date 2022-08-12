package com.example.vacationproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*
import java.util.*

class RecyclerViewAdapter(private val items: ArrayList<DataScoreBoard>):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()
{


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.id.text = items.get(position).id.toString()
            holder.score.text = items.get(position).score.toString()
        }

        override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val id = view.findViewById<TextView>(R.id.recyclerViewItemId)
        val score = view.findViewById<TextView>(R.id.recyclerViewItemScore)
    }
}
