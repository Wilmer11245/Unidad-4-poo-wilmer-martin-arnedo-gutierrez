/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.ejercicios;

/**
 *
 * @author Usuario
 */
public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String inputPassword) {
        return usuario.password.equals(inputPassword);
    }
}
