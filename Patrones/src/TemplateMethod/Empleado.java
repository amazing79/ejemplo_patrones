/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author ignacio
 */
public abstract class Empleado {
    
    private int cantidad_horas;
    private int cantidad_hijos;
    
    public Empleado(){
        this.cantidad_hijos = 0;
        this.cantidad_horas = 0;
 
    }

    /**
     * @return the cantidad_horas
     */
    public int getCantidad_horas() {
        return cantidad_horas;
    }

    /**
     * @param cantidad_horas the cantidad_horas to set
     */
    public void setCantidad_horas(int cantidad_horas) {
        this.cantidad_horas = cantidad_horas;
    }

    /**
     * @return the cantidad_hijos
     */
    public int getCantidad_hijos() {
        return cantidad_hijos;
    }

    /**
     * @param cantidad_hijos the cantidad_hijos to set
     */
    public void setCantidad_hijos(int cantidad_hijos) {
        this.cantidad_hijos = cantidad_hijos;
    }
    
    
}
