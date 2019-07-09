package com.bonial.infra

import android.app.Activity
import android.content.res.Configuration

object ActivityHelper{


    fun isPortrait(activity: Activity?) = activity?.resources?.configuration?.orientation == Configuration.ORIENTATION_PORTRAIT
}