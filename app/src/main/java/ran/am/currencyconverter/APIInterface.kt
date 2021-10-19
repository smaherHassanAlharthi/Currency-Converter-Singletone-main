package ran.am.receipeapp


import ran.am.currencyconverter.Datum
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface APIInterface {

    @GET("eur.json")
    fun getCurrency(): Call<Datum>?
}