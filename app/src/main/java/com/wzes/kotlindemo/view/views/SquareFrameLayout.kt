package com.wzes.kotlindemo.view.views

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

/**
 * Created by xuantang on 17-10-12.
 */
class SquareFrameLayout @JvmOverloads constructor(
        context: Context,
        attrs:AttributeSet?=null,
        defStyleAttr: Int=0
) : FrameLayout(context, attrs, defStyleAttr){
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }
}