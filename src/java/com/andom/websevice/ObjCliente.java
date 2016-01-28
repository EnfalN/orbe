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
public class ObjCliente {
    
    private Integer id_cliente;
    private List<ObjActividadEconomica> lstactividadEconomica;
    private List<ObjDireccion> lstdireccion;
    private String Nombre ;
    private String rut;
    private String estado;

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public List<ObjActividadEconomica> getLstactividadEconomica() {
        return lstactividadEconomica;
    }

    public void setLstactividadEconomica(List<ObjActividadEconomica> lstactividadEconomica) {
        this.lstactividadEconomica = lstactividadEconomica;
    }

    public List<ObjDireccion> getLstdireccion() {
        return lstdireccion;
    }

    public void setLstdireccion(List<ObjDireccion> lstdireccion) {
        this.lstdireccion = lstdireccion;
    }
 

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
