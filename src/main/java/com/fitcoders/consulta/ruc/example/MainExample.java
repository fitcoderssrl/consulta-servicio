/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fitcoders.consulta.ruc.example;

import com.fitcoders.consulta.ruc.model.request.Ruc;
import com.fitcoders.consulta.ruc.model.response.EntityResponse;
import com.fitcoders.consulta.ruc.service.ApiServices;
import com.fitcoders.consulta.ruc.retrofit.ApiConsultaRuc;

/**
 *
 * @author Max Dicson
 */
public class MainExample {

    public static void main(String[] args) throws Exception {
        String apiKey = "PNVn0DEQiy9iKsG7yO7al1c9vjVZBabi1UIhEqAP";

        ApiConsultaRuc api = ApiServices.apiRuc();
        EntityResponse entityResponse = api.basic(
                apiKey,
                Ruc.of("20600567013")
        ).execute().body();

        System.out.println("entity: " + entityResponse);

    }
}
