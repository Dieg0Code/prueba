
package ejercicio2;

import ejercicio2.persona.Persona;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su nombre ");
        String nombre = entrada.nextLine();
        System.out.println("ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.println("ingrese su domicilio");
        String domicilio = entrada.nextLine();
        Persona persona = new Persona(nombre, apellido, domicilio);
        System.out.println("nombre y apellidos "+persona.Datos());
        System.out.println("Domicilio "+persona.DatosCompletos());
        
        
        
    }
    
}
