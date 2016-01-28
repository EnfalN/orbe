/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andom.websevice;

import java.util.List;

/**
 *
 * @author fsilva
 */
public class ObjPadre {
    private List<ObjUsuario> user;
    private List<ObjStock> stock;
    private List<ObjCliente> cliente;

    public List<ObjUsuario> getUser() {
        return user;
    }

    public void setUser(List<ObjUsuario> user) {
        this.user = user;
    }

    public List<ObjStock> getStock() {
        return stock;
    }

    public void setStock(List<ObjStock> stock) {
        this.stock = stock;
    }

    public List<ObjCliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<ObjCliente> cliente) {
        this.cliente = cliente;
    }

 
 
  
    
    
    
}
