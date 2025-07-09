/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.ejercicios;

/**
 *
 * @author Usuario
 */
public class CalculadoraPrecio {
    public double calcularPrecioConImpuesto(Producto producto, double impuesto) {
        return producto.precio + (producto.precio * impuesto);
    }
}
