/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7.ejercicios;

/**
 *
 * @author Usuario
 */
public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("123456789", 500000, "Ahorros");

        
        // System.out.println(c1.numeroCuenta); 

        
        c1.mostrarDetalles();

        
        System.out.println("Tipo de cuenta: " + c1.tipoCuenta);

        
        c1.setSaldo(700000);
        System.out.println("Nuevo saldo: $" + c1.getSaldo());
    }
}
