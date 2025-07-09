/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5.ejercicios;

/**
 *
 * @author Usuario
 */
public class PruebaCliente {
    
    public static void main(String[] args) {
        Cliente p1 = new Cliente();

        
        // p1.nombre = "Ana"; 

        
        p1.setNombre("Ana");
        System.out.println("Nombre: " + p1.getNombre());

        
        p1.edad = 25;
        System.out.println("Edad: " + p1.edad);
    }
    
}
