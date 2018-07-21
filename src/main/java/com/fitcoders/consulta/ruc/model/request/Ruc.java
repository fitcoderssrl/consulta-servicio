/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fitcoders.consulta.ruc.model.request;

/**
 *
 * @author Max Dicson
 */
public class Ruc {

    private String id;

    public Ruc() {
    }

    public static Ruc of(String ruc) {
        return new Ruc(ruc);
    }            
    
    public Ruc(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
