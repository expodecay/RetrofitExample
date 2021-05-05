package com.bignerdranch.android.retrofitexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.retrofitexample.R
import com.bignerdranch.android.retrofitexample.model.Post
import kotlinx.android.synthetic.main.row_layout.view.*

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    private var myList = emptyList<Post>()

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.userId_txt.text = "userId: " + myList[position].userId.toString()
        holder.itemView.id_txt.text = "id: " + myList[position].id.toString()
        holder.itemView.title_txt.text = "title: " + myList[position].title
        holder.itemView.body_txt.text = "body: " + myList[position].body
    }

    // called from mainActivity whenever live data changes
    fun setData(newList: List<Post>){
        myList = newList
        notifyDataSetChanged()
    }
}