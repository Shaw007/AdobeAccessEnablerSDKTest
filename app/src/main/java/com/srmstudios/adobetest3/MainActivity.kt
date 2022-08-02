package com.srmstudios.adobetest3

import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var mvpdManagerJava: MVPDManagerJava

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mvpdManagerJava = MVPDManagerJava(applicationContext)

        findViewById<Button>(R.id.btnIntiateRequesterCall).setOnClickListener {
            mvpdManagerJava.setRequester()
        }

        findViewById<Button>(R.id.btnTriggerCallbackManually).setOnClickListener {
            val callback = mvpdManagerJava.getAcccessEnablerDelegate()
            callback.setRequestorComplete(25)
        }
    }
}
