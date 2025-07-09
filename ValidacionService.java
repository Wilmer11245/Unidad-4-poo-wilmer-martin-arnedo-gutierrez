/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.ejercicios;

/**
 *
 * @author Usuario
 */
public class ValidacionService {
    public boolean validarPassword(Usuario usuario) {
        return usuario.password.length() >= 8;
    }
}
