/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alumnojava;

/**
 *
 * @author Computadora
 */
public class PruebaAlumno {

    public static void main(String[] args) {
                Alumno alumno1 = new Alumno("foto1_url", "Juan Perez", 20, 85, 90, 88, 92);
        
        alumno1.mostrarInformacion();
        alumno1.mostrarInformacion(true);
        alumno1.mostrarInformacion(1);
        alumno1.mostrarInformacion("Detalles del Alumno:");
        alumno1.setNombre("Ana Lopez");
        alumno1.setEdad(21);

        System.out.println("\nDespues de actualizar:");
        alumno1.mostrarInformacion();
        
        Alumno alumno2 = new Alumno("foto2_url", "Ana Lopez", 21, 82, 89, 91, 85);
        Alumno alumno3 = new Alumno("foto3_url", "Carlos Gomez", 22, 78, 83, 80, 87);
        Alumno alumno4 = new Alumno("foto4_url", "Laura Martinez", 23, 90, 94, 88, 93);
        
        // Mostrar la información de todos los alumnos en la lista
        Alumno.mostrarListaAlumnos();
    }
}
