/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.ejercicios;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona {
    String departamento;

    
    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // llama al método de Persona
        System.out.println("Departamento: " + departamento);
    }
}
