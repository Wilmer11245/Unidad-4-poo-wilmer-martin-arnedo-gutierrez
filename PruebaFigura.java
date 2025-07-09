/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13.ejercicios;

/**
 *
 * @author Usuario
 */
public class PruebaFigura {
    public static void main(String[] args) {
        Figura r = new Rectangulo(5, 4);
        Figura t = new Triangulo(6, 3);

        System.out.println("Área del rectángulo: " + r.calcularArea());
        System.out.println("Área del triángulo: " + t.calcularArea());
    }
}
