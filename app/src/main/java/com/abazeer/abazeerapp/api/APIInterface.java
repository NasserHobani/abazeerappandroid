package com.abazeer.abazeerapp.api;

import com.abazeer.abazeerapp.model.DataResponse;
import com.abazeer.abazeerapp.model.LoginResponse;
import com.abazeer.abazeerapp.model.OrderItemModel;
import com.abazeer.abazeerapp.model.OrderModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIInterface {
    @Headers("Accept: application/json")
    @FormUrlEncoded
    @POST("login")
    Call<LoginResponse> login(@Field("email") String email, @Field("password") String Password, @Field("cat_id") int cat_id);
    @Headers("Accept: application/json")
    @GET("getOrders")
    Call<DataResponse<OrderModel>> getOrder(@Header("Authorization") String Authorization);

    @Headers("Accept: application/json")
    @FormUrlEncoded
    @POST("getItems")
    Call<DataResponse<OrderItemModel>> getItems(@Header("Authorization") String Authorization, @Field("name") String name);
}
