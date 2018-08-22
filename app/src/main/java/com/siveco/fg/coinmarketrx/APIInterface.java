package com.siveco.fg.coinmarketrx;

import com.siveco.fg.coinmarketrx.retrofit.info.Info;
import com.siveco.fg.coinmarketrx.retrofit.listings.CryptoList;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface APIInterface {

    //https://pro.coinmarketcap.com/api/v1#section/Quick-Start-Guide
    //@Headers("X-CMC_PRO_API_KEY: 3f921709-ae40-4835-8f1b-ce7a88de1f12")

    @GET("/v1/cryptocurrency/listings/latest?")
    Single<CryptoList> getMarketPairsLatest(@Query("limit") String limit);

    @GET("/v1/cryptocurrency/info")
    Single<Info> getCryptocurrencyInfo(@Query("symbol") String symbol);
}
