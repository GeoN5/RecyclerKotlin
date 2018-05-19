package com.example.geonho.recyclerkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.item_default_recycler.view.*

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image: ImageView = itemView.findViewById(R.id.image)
    var titleText: TextView = itemView.findViewById(R.id.titleText)
    var content: TextView = itemView.findViewById(R.id.content)

}

class RecyclerAdapter(val context: Context, val resourceId: Int, val dataList: ArrayList<RecyclerModel>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(resourceId, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var recyclerModel: RecyclerModel = dataList[position]
        holder.itemView.image.setImageResource(recyclerModel.image)
        holder.itemView.titleText.text = (recyclerModel.titleText)
        holder.itemView.content.text = (recyclerModel.content)
        holder.itemView.setOnClickListener {
            Toast.makeText(context,"${recyclerModel.content} 이 클릭되었습니다.",Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}

