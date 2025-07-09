/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5.ejercicios;
import Taller5.ejercicios.Moto;
import Taller5.ejercicios.Vehiculo;
/**
 *
 * @author Usuario
 */
   
public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Transporte");
        Moto m1 = new Moto("Deportiva");

        // v1.tipo = "Nuevo tipo"; 
        // m1.tipo = "Nueva moto"; 

        // v1.mostrarTipo(); 
        // m1.mostrarMoto(); 

        System.out.println("No se puede acceder a miembros default desde otro paquete.");
    }
    
}
