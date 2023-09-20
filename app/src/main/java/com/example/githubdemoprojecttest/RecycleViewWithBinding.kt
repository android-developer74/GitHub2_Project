package com.example.githubdemoprojecttest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubdemoprojecttest.databinding.ItemRecycleviewBinding

class RecycleViewWithBinding(val songList:ArrayList<String>): RecyclerView.Adapter<RecycleViewWithBinding.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(ItemRecycleviewBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(songList[position]){
                 binding.textViewName.text = this
            }
        }
    }

    override fun getItemCount(): Int {
       return songList.size
    }

    class ViewHolder(val binding: ItemRecycleviewBinding): RecyclerView.ViewHolder(binding.root)

}