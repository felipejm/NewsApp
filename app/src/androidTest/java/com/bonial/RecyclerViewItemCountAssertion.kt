package com.bonial

import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.NoMatchingViewException
import androidx.test.espresso.ViewAssertion
import org.junit.Assert

class RecyclerViewCheckSpanSize(private val position: Int, private val spanCount: Int) : ViewAssertion {

    override fun check(view: View, noViewFoundException: NoMatchingViewException?) {
        if (noViewFoundException != null) {
            throw noViewFoundException
        }

        val recyclerView = view as RecyclerView
        val gridLayoutManager = recyclerView.layoutManager as? GridLayoutManager

        Assert.assertEquals(gridLayoutManager?.spanSizeLookup?.getSpanSize(position), spanCount)
    }
}