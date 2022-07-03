package com.example.kotlincatpunch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //画面タッチ
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var iv: ImageView = findViewById(R.id.iv)

        //条件分岐(押した時、動かした時、離した時)　　　?は空っぽでも処理行うってこと
        when(event?.action){
            MotionEvent.ACTION_DOWN -> iv.setImageResource(R.drawable.cat02)
            MotionEvent.ACTION_MOVE -> iv.setImageResource(R.drawable.cat03)
            MotionEvent.ACTION_UP -> iv.setImageResource(R.drawable.cat01)
        }

        return super.onTouchEvent(event)
    }
}