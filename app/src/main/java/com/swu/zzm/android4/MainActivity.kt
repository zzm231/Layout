package com.swu.zzm.android4

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
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

            background = getDrawable(R.color.purple_500)
        }.also { setContentView(it) }

        //添加第一个子控件 横向布局的LinearLayout
        LinearLayout(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,dp2px(100))
            orientation = LinearLayout.VERTICAL
            background = getDrawable(R.color.purple_200)
            container.addView(this)
        }.apply {
            //图片
            ImageView(this@MainActivity).apply {
                layoutParams = LinearLayout.LayoutParams(
                        dp2px(100),
                        LinearLayout.LayoutParams.MATCH_PARENT
                )

                //添加图片资源
                setImageResource(R.drawable.header)

                //设置填充模式
                scaleType = ImageView.ScaleType.CENTER_CROP

                //添加到容器中
                addView(this)
            }

            //添加标题
            TextView(this@MainActivity).apply {
                layoutParams = LinearLayout.LayoutParams(
                        0,
                        LinearLayout.LayoutParams.MATCH_PARENT
                ).apply {
                    weight = 1f
                    setMargins(dp2px(10),dp2px(10),dp2px(10),dp2px(10))
                }

                text = "马超是一名冷静利落的战士。他本是西凉少寨主之一"
                setTextColor(getColor(R.color.white))
                textSize = 20f
                addView(this)
            }
        }

        //创建第二个子控件 TextView
        TextView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT
            ).apply {
                setMargins(dp2px(10),dp2px(10),dp2px(10),dp2px(10))
            }
            background = getDrawable(R.color.purple_500)
            text ="马超是一名冷静利落的战士。他本是西凉少寨主之一。他的父亲卷进武都战略、挑起同族相残。少寨主们本共同立誓维护西凉和平，却最终纷纷倒在刀尖之下，马超也被父亲关押。在族中长老帮助下，他连夜逃出，带着牺牲兄弟的遗物——四把冷晖枪，流落异乡。\n" +
                    "他的处境被司马懿利用。以教授御枪之术为交换，司马懿让马超进入益城军收集情报。马超答应下来，学习御枪术并为他提供情报。了解到司马懿是武都军师后，马超反向利用其计划，在乌岭一战与四名益城大将里应外合，大败武都军。\n" +
                    "这一战为他赢得了极高的荣誉。然而对马超来说，归去故国的征程，才刚刚开始……他终究要回去，恢复它的纯洁。至于这一天什么时候会到来，他也不得而知。"
            setTextColor(getColor(R.color.white))
            textSize = 20f
            container.addView(this)
        }
    }

    private fun dp2px(dp:Int): Int {
        return (resources.displayMetrics.density * dp).toInt()
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