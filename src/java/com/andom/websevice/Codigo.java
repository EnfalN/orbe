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
public class Codigo {
    
    private Integer id;
    private Integer id_tipo_codigo;
    private String descripcion;
    private Double valor;
    private Integer valor2;
    private Integer valor3;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Codigo other = (Codigo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
      return String.format("%s[id=%d]", getClass().getSimpleName() ,getId());
    }

    
        public Codigo() {
     
    }
    
     public Codigo(  Integer id,
     Integer id_tipo_codigo,
     String descripcion,
     Double valor,
     Integer valor2,
     Integer valor3)
          {
       this.id = id;
       this.id_tipo_codigo = id_tipo_codigo;
       this.descripcion = descripcion;
       this.valor = valor;
       this.valor2 = valor2;
       this.valor3 = valor3;

       
   }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_tipo_codigo() {
        return id_tipo_codigo;
    }

    public void setId_tipo_codigo(Integer id_tipo_codigo) {
        this.id_tipo_codigo = id_tipo_codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getValor2() {
        return valor2;
    }

    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }

    public Integer getValor3() {
        return valor3;
    }

    public void setValor3(Integer valor3) {
        this.valor3 = valor3;
    }
    
    
    
}
