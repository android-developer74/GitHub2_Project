package com.example.githubdemoprojecttest

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Gallery
import android.widget.ImageView


class CustomizedGalleryAdapter(private val context: Context, private val images: IntArray) : BaseAdapter() {

    override fun getCount(): Int {
        return images.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
        val imageView = ImageView(context)
        imageView.setImageResource(images[position])
        imageView.layoutParams = Gallery.LayoutParams(200, 200)
        return imageView
    }
}
