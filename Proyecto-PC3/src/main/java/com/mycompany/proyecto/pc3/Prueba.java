/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto.pc3;

/**
 *
 * @author Computadora
 */
public class Prueba {

    public static void main(String[] args) {
        SalaProyeccion salaVacia = new SalaProyeccion();
        salaVacia.setCodigo(1);
        salaVacia.setNombre("Sala 3D");
        salaVacia.ubicacion = new Ubicacion(1, 'B', 5);
        salaVacia.setAforo(200);
        salaVacia.setNumPuertasEntrada(3);
        salaVacia.setNumPuertasSalida(3);
        
        Ubicacion ubicacion = new Ubicacion(4, 'D', 1);
        SalaProyeccion salaParametrizado = new SalaProyeccion(3, "Sala VIP", ubicacion, 230, 5, 4);
        
        
        System.out.println("Datos de sala con constructor vacío:");
        System.out.println(salaVacia);

        System.out.println("\nDatos de sala con constructor parametrizado:");
        System.out.println(salaParametrizado);
    }
}
