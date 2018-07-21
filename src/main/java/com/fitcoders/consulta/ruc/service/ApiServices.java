/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fitcoders.consulta.ruc.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.fitcoders.consulta.ruc.retrofit.ApiConsultaRuc;
import com.fitcoders.consulta.ruc.util.Const;

/**
 *
 * @author Max Dicson
 */
public class ApiServices {

    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Const.URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static ApiConsultaRuc apiRuc = retrofit.create(ApiConsultaRuc.class);
    
    public static ApiConsultaRuc apiRuc() {
        return apiRuc;
    }

}
