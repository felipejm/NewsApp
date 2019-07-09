package com.bonial.infra.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import android.text.style.UnderlineSpan
import android.text.SpannableString
import com.bonial.R
import kotlinx.android.synthetic.main.view_error.view.*

class ErrorView: ConstraintLayout {

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context) : super(context)

    var tryAgainListener: () -> Unit = {}

    init {
        View.inflate(context, R.layout.view_error, this)
        configureView()
        configureClickListeners()
    }

    private fun configureClickListeners(){
        try_again_button.setOnClickListener {
            tryAgainListener()
        }
    }

    private fun configureView(){
        val text = SpannableString(context.getString(R.string.error_view_error_touch_here_to_try_again))
        text.setSpan(UnderlineSpan(), 0, text.length, 0)
        try_again_button.text = text
    }
}