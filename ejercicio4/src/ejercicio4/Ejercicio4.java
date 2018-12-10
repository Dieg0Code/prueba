/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import funcionario.Funcionario;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su rut: ");
        String rut = entrada.nextLine();
        System.out.println("ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("ingrese su apellido: ");
        String apellido = entrada.nextLine();
        System.out.println("ingrese su domicilio: ");
        String domicilio = entrada.nextLine();
        System.out.println("ingrese su fecha de nacimiento: ");
        String fechaNacimiento = entrada.nextLine();
        System.out.println("ingrese su sueldo bruto: ");
        double sueldoBruto = entrada.nextDouble();
        Funcionario funcionario1 = new Funcionario(rut, nombre, apellido,domicilio, fechaNacimiento, sueldoBruto);
        System.out.println(funcionario1.getAtributos());
     
    }
    
}
