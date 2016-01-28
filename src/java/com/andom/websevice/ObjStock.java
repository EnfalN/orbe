/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andom.websevice;

import java.util.Objects;

/**
 *
 * @author fsilva
 */
public class ObjStock  implements java.io.Serializable {
    private Integer id;
    private Integer id_producto;
   private String cod_producto;
   private String descripcion_producto;
   private Integer stock;
   private Integer precio_fijo;
   private String cod_bar;


    public ObjStock() {
     
    }
 @Override
    public String toString() {
        return cod_producto;
    }
   
   public ObjStock(Integer id, Integer id_producto, String cod_producto, String descripcion_producto, Integer stock, Integer precio_fijo, String cod_bar ) {
       this.id = id;
       this.id_producto= id_producto;
       this.cod_producto = cod_producto;
       this.descripcion_producto = descripcion_producto;
       this.stock = stock;
       this.precio_fijo = precio_fijo;
       this.cod_bar = cod_bar;
      
 
    }

    public String getCod_bar() {
        return cod_bar;
    }

    public void setCod_bar(String cod_bar) {
        this.cod_bar = cod_bar;
    }

   
    
    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }
   
   
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   
   
   
    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPrecio_fijo() {
        return precio_fijo;
    }

    public void setPrecio_fijo(Integer precio_fijo) {
        this.precio_fijo = precio_fijo;
    }
    
    
    
    
}
