/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.ejercicios;

/**
 *
 * @author Usuario
 */
public class Error2 {
    public interface Nadador {
    void nadar();
}

public class Computador implements Nadador {
    @Override
    public void nadar() {
        System.out.println("El computador está nadando... (no tiene sentido)");
    }
}
}
