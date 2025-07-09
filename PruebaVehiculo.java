/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.ejercicios;

/**
 *
 * @author Usuario
 */
public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Transporte", "Toyota");

        
        // System.out.println(v1.tipo); 
        // System.out.println(v1.marca); 

        v1.mostrarVehiculo(); // 

        Moto m1 = new Moto("Deportiva", "Yamaha", 600);
        m1.mostrarMoto(); // 
    }
}
