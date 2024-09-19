/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto.pc2;

import java.util.Date;

/**
 *
 * @author Computadora
 */
public class ProyectoPC2 {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Crear productos
        Producto p1 = new Producto(001, "Arroz", 1.20, "2024/10/31");
        Producto p2 = new Producto(002, "Frijoles", 0.85, "2024/9/25");
        Producto p3 = new Producto(003, "Azúcar", 0.90, "2024/9/30");

        // Almacenar productos en diferentes niveles
        inventario.almacenar(p1, 1);
        inventario.almacenar(p2, 1);
        inventario.almacenar(p3, 2);

        // Mostrar el contenido del nivel 1
        inventario.mostrarNivel(1);

        // Extraer un producto del nivel 1
        Producto extraido = inventario.extraer(2, 1);
        System.out.println("Producto extraído: " + extraido);

        // Mostrar nuevamente el contenido del nivel 1
        inventario.mostrarNivel(1);
    }
}
