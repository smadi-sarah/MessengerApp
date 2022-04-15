package io.bm.messengerapp.Fragments;

import io.bm.messengerapp.Notifications.MyResponse;
import io.bm.messengerapp.Notifications.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService
{

    @Headers({
            "Content - Type:application/json",
            "Authorization:key= AAAA-CPMUfc:APA91bEFOTXB18SO8BSx-7hCPYE4L5qYHEFTfbVpviLtd1R0rLfmv--igy-V82vOtqTRQBa15_M2Dh5S-j4moyCquSa-Ds0W-RfjKV36Q-iR0Wpww3hlR_KOkvkpRaGGM7M9C-nCJ3xx"

    })

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
