package com.freedays.mobileacademy.MyAppFreeDay;

import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Service
public class FreeDayRetrofitService {

    private FreeDayRetrofitInterface service;

    public FreeDayRetrofitService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(FreeDayRetrofitInterface.class);
    }

    public List<FreeDayModel> getFreeDays(int year, String countryCode) throws IOException {

        System.out.println("#### retrofit service getFreeDays");
        Call<List<FreeDayModel>> retrofitCall = service.getFreeDays(year, countryCode);

        Response<List<FreeDayModel>> resp = retrofitCall.execute(); // sync call

        System.out.println("#### after execute " + resp.code());
        if (resp.isSuccessful()) {
            return resp.body();
        } else {

            throw new IOException("Request failed" + resp.code());
        }
    }


}
