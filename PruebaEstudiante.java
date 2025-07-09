/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.ejercicios;

/**
 *
 * @author Usuario
 */
public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.setNombre("Juan");
        e1.setEdad(20);
        e1.setNotaPromedio(4.3);

        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Edad: " + e1.getEdad());
        System.out.println("Nota promedio: " + e1.getNotaPromedio());
    }
    
}
