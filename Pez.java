/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.ejercicios;

/**
 *
 * @author Usuario
 */
public class Pez extends Animal {
    String tipoDeAgua;

   
    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

  
    public void mostrarDetalles() {
        super.mostrarEspecie(); 
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
