/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.ejercicios;

/**
 *
 * @author Usuario
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona();
        Persona e = new Estudiante();
        Persona prof = new Profesor();

        p.presentarse();    
        e.presentarse();    
        prof.presentarse(); 
    }
}
