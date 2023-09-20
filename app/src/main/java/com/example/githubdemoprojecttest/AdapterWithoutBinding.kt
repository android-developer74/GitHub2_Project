package com.example.githubdemoprojecttest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class AdapterWithoutBinding(val songList: ArrayList<String>) : RecyclerView.Adapter<AdapterWithoutBinding.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recycleview, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(songList[position]){
                tittle.text = this
            }
        }
    }


    override fun getItemCount(): Int {
       return songList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name =  itemView.findViewById<AppCompatTextView>(R.id.textViewName)
        val tittle =  itemView.findViewById<AppCompatTextView>(R.id.textViewTittle)
    }
}