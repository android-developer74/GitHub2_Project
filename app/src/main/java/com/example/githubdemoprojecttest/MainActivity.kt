package com.example.githubdemoprojecttest

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.Gallery
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var simpleGallery: Gallery? = null

    var customGalleryAdapter: CustomizedGalleryAdapter? = null
    var selectedImageView: ImageView? = null

    var images = intArrayOf(
        R.drawable.ic_launcher_background1,
        R.drawable.ic_launcher_background2,
        R.drawable.ic_launcher_background3,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simpleGallery = findViewById<View>(R.id.languagesGallery) as Gallery
        selectedImageView = findViewById<View>(R.id.imageView) as ImageView
        customGalleryAdapter = CustomizedGalleryAdapter(applicationContext, images)
        simpleGallery!!.adapter = customGalleryAdapter
        simpleGallery!!.onItemClickListener =
            OnItemClickListener { parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
                selectedImageView!!.setImageResource(images[position])
            }

        simpleGallery?.setOnScrollChangeListener { view, i, i2, i3, i4 ->
            val centerPosition: Int? = simpleGallery?.getSelectedItemPosition()
            selectedImageView!!.setImageResource(images[centerPosition!!])
        }

    }
}
