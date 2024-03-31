package org.clipboardshared.manager.ui.view

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.textfield.MaterialAutoCompleteTextView

class AutoCompleteTextView : MaterialAutoCompleteTextView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun performFiltering(text: CharSequence, keyCode: Int) {
        super.performFiltering("", 0)
    }
}