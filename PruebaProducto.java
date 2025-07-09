/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5.ejercicios;

/**
 *
 * @author Usuario
 */
public class PruebaProducto {
    
    public static void main(String[] args) {
        Producto p1 = new Producto("Jabón", 2500, 50);
        p1.mostrarInfo();

        
        System.out.println("Acceso directo al stock: " + p1.stock);
    }
    
}
