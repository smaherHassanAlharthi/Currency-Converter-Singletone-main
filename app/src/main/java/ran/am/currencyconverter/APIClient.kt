package ran.am.receipeapp

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import ran.am.currencyconverter.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {
    var retrofit: Retrofit? = null

    fun getClient(): Retrofit? {
        retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }
}