/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andom.websevice;

/**
 *
 * @author fsilva
 */
public class ObjProducto implements java.io.Serializable{
     private String cod_bar_unitario;
     private String cod_prod;
     private String nombre_prod;
     private Integer valor;
     private Integer descuento ;

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public String getCod_bar_unitario() {
        return cod_bar_unitario;
    }

    public void setCod_bar_unitario(String cod_bar_unitario) {
        this.cod_bar_unitario = cod_bar_unitario;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
     
    
    
}
