package com.bonial.infra

import android.content.Context
import com.bonial.infra.retrofit.RetrofitClient
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.Glide
import com.bumptech.glide.Registry
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader
import com.bumptech.glide.module.AppGlideModule
import okhttp3.OkHttpClient
import org.koin.core.KoinComponent
import org.koin.core.inject
import java.io.InputStream

@GlideModule
class UnsafeOkHttpGlideModule : AppGlideModule(), KoinComponent {

    private val okHttpClient: OkHttpClient by inject()

    override fun registerComponents(context: Context, glide: Glide, registry: Registry) {
        registry.replace(GlideUrl::class.java, InputStream::class.java,OkHttpUrlLoader.Factory(okHttpClient))
    }
}