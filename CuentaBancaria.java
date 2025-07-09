/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.ejercicios;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

   
    public CuentaBancaria() {
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

   
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0; 
    }

   
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

   
    public void mostrarCuenta() {
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("Saldo: $" + this.saldo);
        System.out.println("Tipo de cuenta: " + this.tipoCuenta);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
}
