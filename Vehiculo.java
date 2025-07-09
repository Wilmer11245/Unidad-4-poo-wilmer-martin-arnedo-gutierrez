/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5.ejercicios;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    
    String tipo; // acceso de paquete (default)

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
    
}
