package com.mataharimall.mmandroid.remoteapi

import io.reactivex.Single
import okhttp3.Response
import retrofit2.http.*

/**
 * Defines the abstract methods used for interacting with the Bufferoo API
 */
interface ApiService {

    @POST("/{url}")
    fun postRequest(
            @Path(value = "url", encoded = false) url: String,
            @Body body: Any): Single<Response>

    @GET("/{url}")
    fun getRequest(@Path(value = "url", encoded= false) url: String): Single<Response>

}