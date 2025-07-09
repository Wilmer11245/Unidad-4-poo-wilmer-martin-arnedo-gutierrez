/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.ejercicios;

/**
 *
 * @author Usuario
 */
//public class Libro {
   // String titulo;
    //String autor;
    //int paginas;

    //public void mostrarInformacion() {
        //System.out.println("Título: " + titulo);
        //System.out.println("Autor: " + autor);
        //System.out.println("Páginas: " + paginas);
    //}

    //public void generarReporte() {
        //System.out.println("Generando reporte en PDF...");
        // código para PDF
   // }

    //public void guardarEnBaseDeDatos() {
        //System.out.println("Guardando libro en la base de datos...");
       
    //}
//}
public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }
}
