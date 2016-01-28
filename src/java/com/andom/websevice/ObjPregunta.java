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
public class ObjPregunta {
    
    private Integer numero;
    private String Pregunta;
    private List<ObjRespuesta> objRespuesta;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }

    public List<ObjRespuesta> getObjRespuesta() {
        return objRespuesta;
    }

    public void setObjRespuesta(List<ObjRespuesta> objRespuesta) {
        this.objRespuesta = objRespuesta;
    }
    
    
    
    
}
