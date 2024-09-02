/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cancionjava;

/**
 *
 * @author Computadora
 */
public class Cancion {
    private String nombre;
    private String cantante;
    private String genero;
    private int duracion;

    public Cancion() {
    }

    public Cancion(String nombre, String cantante, String genero, int duracion) {
        this.nombre = nombre;
        this.cantante = cantante;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getNombre() {        return nombre;    }

    public void setNombre(String nombre) {        this.nombre = nombre;    }

    public String getCantante() {        return cantante;    }

    public void setCantante(String cantante) {        this.cantante = cantante;    }

    public String getGenero() {        return genero;    }

    public void setGenero(String genero) {        this.genero = genero;    }

    public int getDuracion() {        return duracion;    }

    public void setDuracion(int duracion) {        this.duracion = duracion;    }


    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantante: " + cantante);
    }

    public void mostrarInformacion(boolean mostrarGenero) {
        mostrarInformacion();
        if (mostrarGenero) {
            System.out.println("Genero: " + genero);
        }
    }

    public void mostrarInformacion(int mostrarDuracion) {
        mostrarInformacion();
        if (mostrarDuracion == 1) {
            int minutos = duracion / 60;
            int segundos = duracion % 60;
            System.out.println("Duracion: " + minutos + " minutos y " + segundos + " segundos");
        }
    }

    public void mostrarInformacion(String mensaje) {
        System.out.println(mensaje);
        mostrarInformacion();
    }
}
