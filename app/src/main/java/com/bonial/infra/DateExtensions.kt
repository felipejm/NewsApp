package com.bonial.infra

import android.text.format.DateUtils
import java.text.SimpleDateFormat


fun String.getRelativeTime(): String{
    val df = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
    val date = df.parse(this.replace("Z", "+0000"))
    val epoch = date.time
    return DateUtils.getRelativeTimeSpanString (epoch, System.currentTimeMillis(), DateUtils.SECOND_IN_MILLIS).toString()
}