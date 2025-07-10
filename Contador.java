/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.ejemplos;

/**
 *
 * @author Usuario
 */
public class Contador {
static int contadorGlobal = 0; 
public Contador() {
contadorGlobal++; 
}
public static void mostrarContador() {
System.out.println("Contador global: " + contadorGlobal);
}
}


