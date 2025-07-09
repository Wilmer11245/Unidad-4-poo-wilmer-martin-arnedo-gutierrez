/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.ejercicios;

/**
 *
 * @author Usuario
 */
public class Error2 {
    public class Vehiculo {
    public void encender() {
        System.out.println("El vehículo se encendió.");
    }
}

public class Coche extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("El vehículo se encendió."); // mismo mensaje, no cambia nada
    }
}
}
