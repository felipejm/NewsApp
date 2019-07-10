package com.bonial.infra.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.security.cert.X509Certificate
import java.util.concurrent.TimeUnit
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager
import javax.security.cert.CertificateException

class OkHttpClientFactory{

    fun create(): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val builder = getUnsafeOkHttpClient()
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(60, TimeUnit.SECONDS)

        return builder
            .addInterceptor(loggingInterceptor)
            .build()
    }

    fun getUnsafeOkHttpClient(): OkHttpClient.Builder {
        try {
            val trustAllCerts = arrayOf<TrustManager>(object : X509TrustManager {

                override fun getAcceptedIssuers(): Array<X509Certificate> {
                    return arrayOf()
                }

                @Throws(CertificateException::class)
                override fun checkClientTrusted(
                    chain: Array<X509Certificate>,
                    authType: String
                ) {
                }

                @Throws(CertificateException::class)
                override fun checkServerTrusted(
                    chain: Array<X509Certificate>,
                    authType: String
                ) {
                }
            })

            val sslContext = SSLContext.getInstance("SSL")
            sslContext.init(null, trustAllCerts, java.security.SecureRandom())
            val builder = OkHttpClient.Builder()
            builder.sslSocketFactory(sslContext.socketFactory, trustAllCerts[0] as X509TrustManager)
            builder.hostnameVerifier { _, _ -> true }
            return builder
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}