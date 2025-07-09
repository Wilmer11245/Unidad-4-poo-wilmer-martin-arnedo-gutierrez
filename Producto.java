/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.ejercicios;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre; // 'this' diferencia el atributo de la variable del parámetro
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
    }
    
}
