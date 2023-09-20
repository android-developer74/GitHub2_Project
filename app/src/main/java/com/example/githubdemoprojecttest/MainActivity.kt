package com.example.githubdemoprojecttest

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.githubdemoprojecttest.databinding.ActivityMainBinding
import com.example.githubdemoprojecttest.databinding.DialogWelcomeBinding


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var dialogBinding: DialogWelcomeBinding? = null
    private var alertDialog: Dialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding?.openNextScreen?.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        init()
    }

    private fun init(){
        val list = arrayListOf("Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3", "Gadder", "Doom3")
        var adapterWithoutBinding = AdapterWithoutBinding(list)
        binding?.songREcycleView?.adapter = adapterWithoutBinding
    }

   /* private fun showDialog() {
        dialogBinding = null
        dialogBinding = DataBindingUtil.inflate(
            LayoutInflater.from(this),
            R.layout.dialog_welcome,
            null,
            false
        )
        alertDialog = Dialog(this, R.style.animateDialog)
        alertDialog!!.setContentView(dialogBinding!!.root)
       // alertDialog!!.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialogBinding!!.textViewWelcome.setOnClickListener {
            alertDialog!!.dismiss()
        }
        alertDialog!!.show()
        val layoutParams = WindowManager.LayoutParams()
        layoutParams.copyFrom(alertDialog!!.window!!.attributes)
        layoutParams.width = WindowManager.LayoutParams.WRAP_CONTENT
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT
        alertDialog!!.window!!.attributes = layoutParams
    }*/
}