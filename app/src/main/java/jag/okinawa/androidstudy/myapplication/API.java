package jag.okinawa.androidstudy.myapplication;

import jag.okinawa.androidstudy.myapplication.models.Eventon;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Retrofit インターフェイス
 * pdc-k-kamiya on 2017/10/09.
 */
public interface API {

    String BASE_URL = "http://eventon.jp/";

    @GET("api/events.json")
    Call<Eventon> apiCall();
}
