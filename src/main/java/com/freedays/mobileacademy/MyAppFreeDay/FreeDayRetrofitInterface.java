package com.freedays.mobileacademy.MyAppFreeDay;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface FreeDayRetrofitInterface {

    //https://date.nager.at/api/v2/publicholidays/2017/AT
    @GET("publicholidays/{year}/{countryCode}")
    Call<List<FreeDayModel>> getFreeDays(@Path("year") Integer year, @Path("countryCode") String countryCode);

}
