/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author nathalia_c.rodriguez
 */
public class Cliente {
   
    private String nombre;
    private String empresa;
    private String identificacion;
    public Cliente() {
    }

    public Cliente(String nombre, String empresa, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.empresa = empresa;
      
    }

    /**
     * Get the value of empresa
     *
     * @return the value of empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Set the value of empresa
     *
     * @param empresa new value of empresa
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * Get the value of identificacion
     *
     * @return the value of identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Set the value of identificacion
     *
     * @param identificacion new value of identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + "," + identificacion +"," + empresa;
    }

   
 
}
