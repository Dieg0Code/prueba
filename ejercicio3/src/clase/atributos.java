/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author alumno
 */
public class atributos {
    private String referencia;
    private String nombre;
    private double precio;

    public atributos(String referencia, String nombre, double precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void SetAtributos(String referencia, String nombre, double precio){
        
    }

    public String GetAtributos(){
        String Atributos = referencia+", "+nombre+", "+precio;
        return Atributos;
    }
    
    public void Calculo_Venta(String referencia){
        
    }
}
