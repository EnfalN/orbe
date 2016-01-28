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
public class ObjComuna {
    
   private Integer id_comuna;
   private ObjRegion region;
   private ObjCiudad ciudad;
   private String nombre;
   private String estado;

    public Integer getId_comuna() {
        return id_comuna;
    }

    public void setId_comuna(Integer id_comuna) {
        this.id_comuna = id_comuna;
    }

    public ObjRegion getRegion() {
        return region;
    }

    public void setRegion(ObjRegion region) {
        this.region = region;
    }

    public ObjCiudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(ObjCiudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
   
    
}
