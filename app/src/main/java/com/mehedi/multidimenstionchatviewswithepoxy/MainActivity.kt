package com.mehedi.multidimenstionchatviewswithepoxy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.epoxy.EpoxyRecyclerView
import com.mehedi.multidimenstionchatviewswithepoxy.uicontrolller.HomeController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val controller = HomeController()

        findViewById<EpoxyRecyclerView>(R.id.messagesView).setController(controller)

        controller.setTitle("Recent Chat")


        //  controller.allMessages = Data.messages
        // controller.recentlyActive = Data.recentlyActive
    }
}