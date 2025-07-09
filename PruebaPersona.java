/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.ejercicios;

/**
 *
 * @author Usuario
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona e1 = new Estudiante(); 
        Persona prof1 = new Profesor(); 

        p1.presentarse();      
        e1.presentarse();      
        prof1.presentarse();   
    }
}