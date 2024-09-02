/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librojava;

/**
 *
 * @author Computadora
 */
public class PruebaLibro {

    public static void main(String[] args) {
        Libro libro = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez", 10, "978-3-16-148410-0", 39.99);

        libro.mostrarInformacion();

        libro.mostrarInformacion(true);

        libro.mostrarInformacion(true, true);

        libro.mostrarInformacion("Detalles del libro:");

        libro.setTitulo("El amor en los tiempos del colera");
        libro.setAutor("Gabriel Garcia Marquez");
        libro.setStock(5);

        System.out.println("\nDespues de actualizar:");
        libro.mostrarInformacion();
        libro.mostrarInformacion(true);
        libro.mostrarInformacion(true, true);
        libro.mostrarInformacion("Detalles actualizados del libro:");
    }
}
