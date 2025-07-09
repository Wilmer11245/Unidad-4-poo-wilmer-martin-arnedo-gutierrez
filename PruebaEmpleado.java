/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.ejercicios;

/**
 *
 * @author Usuario
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Luis", 1800000);
        Gerente g1 = new Gerente("María", 3500000, "Ventas");

        System.out.println("Detalles del empleado:");
        e1.mostrarDetalles();

        System.out.println("\nDetalles del gerente:");
        g1.mostrarDetalles();
    }
}