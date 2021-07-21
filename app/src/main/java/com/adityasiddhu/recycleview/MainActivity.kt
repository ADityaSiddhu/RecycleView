package com.adityasiddhu.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val users = ArrayList<Contacts>()
        users.add(Contacts("Aditya", "8308202469",1))
        users.add(Contacts("D.Senorita","9370848339",2))
        users.add(Contacts("Mumma","9588656441",2))
        users.add(Contacts("Papa", "8329897563",1))
        users.add(Contacts("Rishi", "9579620329",1))
        users.add(Contacts("Vaishali Tai","7620332293",2))

    }
}