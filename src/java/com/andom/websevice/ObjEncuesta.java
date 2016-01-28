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
public class ObjEncuesta {
    
    private Integer numero;
    private List<ObjPregunta> objPregunta;
    private String rut;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<ObjPregunta> getObjPregunta() {
        return objPregunta;
    }

    public void setObjPregunta(List<ObjPregunta> objPregunta) {
        this.objPregunta = objPregunta;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    
}
