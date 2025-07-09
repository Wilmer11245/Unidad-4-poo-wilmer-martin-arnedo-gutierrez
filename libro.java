/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.ejercicios;

/**
 *
 * @author Usuario
 */
public class libro {
       private String titulo;
    private String autor;
    private int numeroPaginas;

    
    public libro() {
        this.titulo = "Sin titulo";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;
    }

    
    public libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    
    public void mostrarDetalles() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numeroPaginas);
    }

    
}
