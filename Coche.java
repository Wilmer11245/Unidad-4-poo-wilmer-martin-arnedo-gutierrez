/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.ejercicios;

/**
 *
 * @author Usuario
 */
public class Coche {
     
    private String marca;
    private String modelo;

    
    private static int contadorCoches = 0;

   
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; 
    }

    
    public static void mostrarContadorCoches() {
        System.out.println("Número de coches creados: " + contadorCoches);
    }

    
}
