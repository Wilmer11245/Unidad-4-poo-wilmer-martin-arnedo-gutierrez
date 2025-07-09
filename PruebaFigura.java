/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.ejercicios;

/**
 *
 * @author Usuario
 */
public class PruebaFigura {
    public static void main(String[] args) {
        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(4, 6);

        f1.calcularArea(); // área del círculo
        f2.calcularArea(); // área del rectángulo
    }
}
