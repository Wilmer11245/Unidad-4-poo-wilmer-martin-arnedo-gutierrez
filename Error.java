/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.ejercicios;

/**
 *
 * @author Usuario
 */
public class Error {
    public class Animal {
    public void comer() {
        System.out.println("El animal está comiendo.");
    }
}

public class Perro extends Animal {
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }
}

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        Animal a = new Perro();
        a.comer();
        // a.ladrar(); 
    }
}
    
}
