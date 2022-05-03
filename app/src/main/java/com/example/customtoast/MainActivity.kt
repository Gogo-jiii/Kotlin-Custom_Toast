package com.example.customtoast

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var customView: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customView = layoutInflater.inflate(
            R.layout.custom_layout,
            findViewById<View>(R.id.rootLayout) as ViewGroup
        )

        btnShowCustomToast.setOnClickListener {
            val toast = Toast(this@MainActivity)
            toast.duration = Toast.LENGTH_LONG
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            toast.setView(customView)
            toast.show()
        }
    }
}