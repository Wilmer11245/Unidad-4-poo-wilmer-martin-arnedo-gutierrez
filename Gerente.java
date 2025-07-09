/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.ejercicios;

/**
 *
 * @author Usuario
 */
public class Gerente extends Empleado {
    
    private String departamento;

    // Constructor
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); 
        this.departamento = departamento;
    }

    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Departamento: " + departamento);
    } 
}