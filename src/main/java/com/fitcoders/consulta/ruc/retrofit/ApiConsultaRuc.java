/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fitcoders.consulta.ruc.retrofit;

import com.fitcoders.consulta.ruc.model.response.Entity;
import com.fitcoders.consulta.ruc.model.request.Ruc;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 *
 * @author Max Dicson
 */
public interface ApiConsultaRuc {

    /**
     * Trae los datos básicos del ruc.
     * @param apiKey
     * @param requestRuc
     * @return 
     */
    @Headers({
        "Accept: application/json"
    })
    @POST("v1/basic")
    Call<Entity> basic(
            @Header("x-api-key") String apiKey,
            @Body Ruc requestRuc);

    /**
     * Todos los detalles de la entidad.
     * @param apiKey
     * @param requestRuc
     * @return 
     */
    @Headers({
        "Accept: application/json"
    })
    @POST("v1/complete")
    Call<Entity> complete(
            @Header("x-api-key") String apiKey,
            @Body Ruc requestRuc);
}
