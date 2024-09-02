/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cancionjava;

/**
 *
 * @author Computadora
 */
public class PruebaCancion {

    public static void main(String[] args) {
        Cancion cancion = new Cancion("Bohemian Rhapsody", "Queen", "Rock", 355);

        cancion.mostrarInformacion();

        cancion.mostrarInformacion(true);

        cancion.mostrarInformacion(1);

        cancion.mostrarInformacion("Detalles de la cancion:");

        cancion.setNombre("Imagine");
        cancion.setCantante("John Lennon");
        cancion.setGenero("Pop");
        cancion.setDuracion(183);

        System.out.println("\nDespues de actualizar:");
        cancion.mostrarInformacion();
        cancion.mostrarInformacion(true);
        cancion.mostrarInformacion(1);
        cancion.mostrarInformacion("Detalles actualizados de la cancion:");
    }
}
