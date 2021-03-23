package com.example.navigation_drawer.Questions_RecyclerVIew

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigation_drawer.R
import kotlinx.android.synthetic.main.todo_item.view.*

class DataTypeAdapter(var dataTypes:List<DataType>, var clickListener: ontodoItemClickListener):RecyclerView.Adapter<DataTypeAdapter.todoViewHolder>() {
    inner class todoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var title1=itemView.tvtitle
        var link1=itemView.link

        fun intialiize(item:DataType, action:ontodoItemClickListener){

            title1.text=item.title
            link1.text=item.link
          /* imageView1.setImageResource(item.imageView)*/
            itemView.setOnClickListener {
                action.onItemClick(item,adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): todoViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.todo_item, parent, false)

        return todoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataTypes.size
    }

    override fun onBindViewHolder(holder: todoViewHolder, position: Int) {
        holder.intialiize(dataTypes.get(position),clickListener)

        /*holder.itemView.apply {
            tvTitle.text = todos[position].title
            cbDone.isChecked = todos[position].isChecked
        }*/



    }
    interface  ontodoItemClickListener{
        fun onItemClick(item:DataType, position: Int)

    }
}