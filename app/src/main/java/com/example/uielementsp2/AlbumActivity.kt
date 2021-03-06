package com.example.uielementsp2

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class AlbumActivity : AppCompatActivity() {
    var names = arrayOf("Moira Dela Torre" , "Ben&Ben" , "Reese Lansangan")
    var images = intArrayOf(R.drawable.moira , R.drawable.benben , R.drawable.reese)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album)

        val gridView = findViewById<GridView>(R.id.gridView)
        val mainAdapter = MainAdapter(this , names , images)
        gridView.adapter = mainAdapter
        gridView.onItemClickListener = OnItemClickListener { _ , _ , position , id ->
            val intent = Intent(this , AlbumDetailsActivity::class.java)
            intent.putExtra("position" , names[position])
            startActivity(intent)
        }
    }
}