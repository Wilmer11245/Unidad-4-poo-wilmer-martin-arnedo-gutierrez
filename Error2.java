/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.ejemplos;

/**
 *
 * @author Usuario
 */
public class Error2 {
   public class Banco {
public static double tasaInteres = 0.05; 
public static void modificarTasa(double nuevaTasa) {
tasaInteres = nuevaTasa; 
}
public static void cambiarSaldo(double saldo) {

saldo = saldo * (1 + tasaInteres); 
}
}
 
}
