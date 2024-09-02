/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librojava;

/**
 *
 * @author Computadora
 */
public class Libro {
    private String titulo;
    private String autor;
    private int stock;
    private double precio;
    
    public String ISBN;

    public Libro() {
    }

    public Libro(String titulo, String autor, int stock, String ISBN, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    public String getTitulo() {        return titulo;    }

    public void setTitulo(String titulo) {        this.titulo = titulo;    }

    public String getAutor() {        return autor;    }

    public void setAutor(String autor) {        this.autor = autor;    }

    public int getStock() {        return stock;    }

    public void setStock(int stock) {        this.stock = stock;    }

    public double getPrecio() {        return precio;    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public void mostrarInformacion(boolean mostrarStock) {
        mostrarInformacion();
        if (mostrarStock) {
            System.out.println("Stock: " + stock);
        }
    }

    public void mostrarInformacion(boolean mostrarStock, boolean mostrarPrecio) {
        mostrarInformacion(mostrarStock);
        if (mostrarPrecio) {
            System.out.println("Precio: S/." + precio);
        }
    }

    public void mostrarInformacion(String mensaje) {
        System.out.println(mensaje);
        mostrarInformacion();
    }
}
