/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.persona;

/**
 *
 * @author alumno
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String domicilio;

    public Persona(String nombre, String apellidos, String domicilio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public String Datos(){
        String datos = nombre+ ", "+apellidos;
        return datos;
    }
    public String DatosCompletos(){
        String datos1 = domicilio;
        return datos1;
    }
}

