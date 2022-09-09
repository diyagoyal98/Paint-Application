package com.example.pintapp

import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import com.example.pintapp.PaintView.Companion.colorList
import com.example.pintapp.PaintView.Companion.currentbrush
import com.example.pintapp.PaintView.Companion.pathList
import kotlin.io.path.Path

class MainActivity : AppCompatActivity() {
    companion object{
        var path=android.graphics.Path()
        var paintbrush=Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val redbutton=findViewById<ImageButton>(R.id.redcolor)
        val bluebutton=findViewById<ImageButton>(R.id.bluecolor)
        val blackbutton=findViewById<ImageButton>(R.id.blackcolor)
        val whitebutton=findViewById<ImageButton>(R.id.whitecolor)
        supportActionBar?.hide()

        redbutton.setOnClickListener{
            //Toast.makeText(this,"clicked red....",Toast.LENGTH_LONG).show()
            paintbrush.setColor(Color.RED)
            currentColor(paintbrush.color)
        }

        bluebutton.setOnClickListener{
            //Toast.makeText(this,"clicked blue....",Toast.LENGTH_LONG).show()
            paintbrush.setColor(Color.BLUE)
            currentColor(paintbrush.color)
        }

        blackbutton.setOnClickListener{
            //Toast.makeText(this,"clicked black....",Toast.LENGTH_LONG).show()
            paintbrush.setColor(Color.BLACK)
            currentColor(paintbrush.color)
        }

        whitebutton.setOnClickListener{
            //Toast.makeText(this,"clicked white....",Toast.LENGTH_LONG).show()
            pathList.clear()
            colorList.clear()
            //removeLast()
            //colorList.removeLast()
            path.reset()
        }
    }

    private fun currentColor(color:Int)
    {
        currentbrush=color
        path=android.graphics.Path()
    }
}