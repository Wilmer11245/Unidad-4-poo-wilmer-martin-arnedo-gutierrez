/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.ejercicios;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    private String curso;

   
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "Ninguno";
    }

    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Ninguno";
    }

    
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // llama al constructor de nombre y edad
        this.curso = curso; // asigna el curso
    }

   
    public void mostrarEstudiante() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Curso: " + this.curso);
    }
    
}
