/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.ejercicios;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    
    String marca;
    int velocidadMaxima;
 
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
