/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.ejercicios;

/**
 *
 * @author Usuario
 */
//public class Banco {
   // protected double saldo;

    //public Banco(double saldo) {
       // this.saldo = saldo;
    //}
//}
public class Banco {
    private double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Cantidad inválida.");
        }
    }
 
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}