/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.ejercicios;

/**
 *
 * @author Usuario
 */
    public class Vehiculo {
    
    protected String tipo;
    protected String marca;

    
    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarVehiculo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }
}
    

