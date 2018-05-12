package com.example.geonho.sharedpreferencex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

   fun setListeners(){
    saveButton.setOnClickListener {
        var value : String = editText1.text.toString()
        SharedPreferenceUtil.saveData(applicationContext,"test",value)
        Toast.makeText(applicationContext,"성공적으로 저장되었습니다!",Toast.LENGTH_SHORT).show()
        editText1.setText("")
    }

    loadButton.setOnClickListener {
        var value : String = SharedPreferenceUtil.getData(applicationContext,"test")
        textView1.text = value
        Toast.makeText(applicationContext,"성공적으로 불러왔습니다!",Toast.LENGTH_SHORT).show()
    }
  }
}
