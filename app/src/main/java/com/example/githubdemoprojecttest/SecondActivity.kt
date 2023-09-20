package com.example.githubdemoprojecttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.githubdemoprojecttest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private var binding: ActivitySecondBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        init()
    }

    private fun init(){
        val list = arrayListOf("Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3")
        val recycleViewWithBinding = RecycleViewWithBinding(list)
        binding?.songREcycleView?.adapter = recycleViewWithBinding
    }
}