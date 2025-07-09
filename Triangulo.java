/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13.ejercicios;

/**
 *
 * @author Usuario
 */
public class Triangulo extends Figura {
    double base;
    double altura;

    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}