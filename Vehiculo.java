/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.ejemplos;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
String tipo;
public Vehiculo(String tipo) {
this.tipo = tipo;
}
}
public class Coche extends Vehiculo {
String marca;

public Coche(String tipo, String marca) {
super(tipo);
this.marca = marca;
}
}

