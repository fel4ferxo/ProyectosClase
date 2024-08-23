/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaaluno;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-AREQUIPA
*/



public class JavaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno nuevoAlumno = new Alumno();
        
        nuevoAlumno.setFoto("foto.png");
        nuevoAlumno.setNombre("Fernando Reinoso");
        String nombre = nuevoAlumno.getNombre();
        String foto = nuevoAlumno.getFoto();
        nuevoAlumno.setEdad(28);
        int edad = nuevoAlumno.getEdad();
        nuevoAlumno.setPc1(15);
        int pc1 = nuevoAlumno.getPc1();
        nuevoAlumno.setPc2(20);
        int pc2 = nuevoAlumno.getPc2();
        nuevoAlumno.setPc3(12);
        int pc3 = nuevoAlumno.getPc3();
        nuevoAlumno.setEf(20);
        int ef = nuevoAlumno.getEf();
        
        System.out.println(nuevoAlumno.VerPantalla(nombre, foto, edad, pc1, pc2, pc3, ef));
        System.out.println("Promedio de nota: " + nuevoAlumno.CalcularPromedio(pc1, pc2, pc3, ef));
        
    }
    
}
