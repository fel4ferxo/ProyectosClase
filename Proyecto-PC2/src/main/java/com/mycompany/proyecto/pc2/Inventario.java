/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.pc2;

import java.util.ArrayList;

/**
 *
 * @author Computadora
 */
public class Inventario {
    
        private static final int CAPACIDAD_NIVEL = 10;
    private static final int NIVELES = 5;
    
    private ArrayList<Producto>[] niveles;

    public Inventario() {
        niveles = new ArrayList[NIVELES];
        for (int i = 0; i < NIVELES; i++) {
            niveles[i] = new ArrayList<>(CAPACIDAD_NIVEL);
        }
    }

    public ArrayList<Producto>[] getNiveles() {        return niveles;    }

    public void setNiveles(ArrayList<Producto>[] niveles) {        this.niveles = niveles;    }
       

    public boolean almacenar(Producto producto, int nivel) {
        if (nivel < 1 || nivel > NIVELES) {
            System.out.println("Nivel inválido. Seleccione un nivel entre 1 y " + NIVELES);
            return false;
        }

        ArrayList<Producto> nivelSeleccionado = niveles[nivel - 1];
        if (nivelSeleccionado.size() < CAPACIDAD_NIVEL) {
            nivelSeleccionado.add(producto);
            System.out.println("Producto almacenado en el nivel " + nivel);
            return true;
        } else {
            System.out.println("Nivel " + nivel + " está lleno.");
            return false;
        }
    }

    public Producto extraer(int codigo, int nivel) {
        if (nivel < 1 || nivel > NIVELES) {
            System.out.println("Nivel inválido. Seleccione un nivel entre 1 y " + NIVELES);
            return null;
        }

        ArrayList<Producto> nivelSeleccionado = niveles[nivel - 1];
        for (int i = 0; i < nivelSeleccionado.size(); i++) {
            if (nivelSeleccionado.get(i).codigo == codigo) {
                return nivelSeleccionado.remove(i);
            }
        }

        System.out.println("Producto no encontrado en el nivel " + nivel);
        return null;
    }

    public void mostrarNivel(int nivel) {
        if (nivel < 1 || nivel > NIVELES) {
            System.out.println("Nivel inválido. Seleccione un nivel entre 1 y " + NIVELES);
            return;
        }

        ArrayList<Producto> nivelSeleccionado = niveles[nivel - 1];
        System.out.println("Nivel " + nivel + ":");
        for (Producto producto : nivelSeleccionado) {
            System.out.println(producto);
        }

        int espaciosDisponibles = CAPACIDAD_NIVEL - nivelSeleccionado.size();
        System.out.println("Espacios disponibles: " + espaciosDisponibles);
    }
}

