package com.yshen.study.process

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yshen.study.R

class ProcessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.main_process_name)
        setContentView(R.layout.activity_process)
    }
}