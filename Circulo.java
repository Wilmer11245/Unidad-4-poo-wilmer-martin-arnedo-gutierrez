/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.ejercicios;

/**
 *
 * @author Usuario
 */
public class Circulo extends Figura {
    double radio;

    
    public Circulo(double radio) {
        this.radio = radio;
    }

   
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
