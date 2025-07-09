/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7.ejercicios;

/**
 *
 * @author Usuario
 */
public class PruebaDeEmpleado {
    
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.nombre = "Carlos";
        e1.setSalario(2500000);

        System.out.println("Nombre: " + e1.nombre);
        System.out.println("Salario: $" + e1.getSalario());

        
        e1.setSalario(-500000); 
    }
}