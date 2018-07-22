/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fitcoders.consulta.ruc.model.response;

import java.util.Objects;

/**
 *
 * @author Max Dicson
 */
public class EntityResponse {

    private Boolean success;
    private String message;
    private Entity item;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Entity getItem() {
        return item;
    }

    public void setItem(Entity item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "EntityResponse{" + "success=" + success + ", message=" + message + ", item=" + item + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.item);
        return hash;
    }

}
