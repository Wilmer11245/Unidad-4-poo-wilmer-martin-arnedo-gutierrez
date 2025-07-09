/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.ejemplos;

/**
 *
 * @author Usuario
 */
//public class Coche {
//private String marca;
//public Coche(String marca) {
//this.marca = marca; // Usamos `this` para referirnos al atributo de la clase
//}
//public void setMarca(String marca) {
//this.marca = marca; // Usamos `this` para evitar la confusión entre el atributo y el parámetro
//}
//public void mostrarMarca() {
//System.out.println("Marca: " + this.marca);
//}
//}

public class Coche {
private String marca;
private int velocidadMaxima;
public Coche() {
this("Desconocida", 0); 
}
public Coche(String marca, int velocidadMaxima) {
this.marca = marca;
this.velocidadMaxima = velocidadMaxima;
}
public void mostrarInformacion() {
System.out.println("Marca: " + this.marca + ", Velocidad máxima: " + this.velocidadMaxima);
}
}

