package com.example.myapplication

import android.os.Bundle

class MainActivity : AccCompatActivity {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun buildAquarium() {}
        Val myAquarium = Aquarium()
        myAquarium.printSize()
        myAquarium.height = 60
        myAquarium.printSize()
    }
    fun main(){
        buildAquarium()
    }
}