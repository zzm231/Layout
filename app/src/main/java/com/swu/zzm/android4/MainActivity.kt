package com.swu.zzm.android4

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addLinearLayoutKotlin()

    }

    private fun addLinearLayoutKotlin(){
        val container = LinearLayout(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT)
            orientation = LinearLayout.VERTICAL

            background = getDrawable(R.color.white)
        }.also {
            setContentView(it)
        }
    }

    private fun addLinearLayoutJava(){
        //创建容器 LinearLayout
        val linearLayout = LinearLayout(this)

        //设置容器宽 高
        linearLayout.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT)

        //设置布局方向
        linearLayout.orientation = LinearLayout.VERTICAL

        //设置颜色
        linearLayout.background = getDrawable(R.color.purple_200)

        //添加容器到Activity上
        setContentView(linearLayout)
    }
}