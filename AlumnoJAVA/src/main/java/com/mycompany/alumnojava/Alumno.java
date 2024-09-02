/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alumnojava;

/**
 *
 * @author Computadora
 */


import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String foto;
    private String nombre;
    private int edad;
    private int pc1;
    private int pc2;
    private int pc3;
    private int ef;

    private static List<Alumno> listaAlumnos = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String foto, String nombre, int edad, int pc1, int pc2, int pc3, int ef) {
        this.foto = foto;
        this.nombre = nombre;
        this.edad = edad;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.ef = ef;
        
        listaAlumnos.add(this);
    }

    public String getFoto() {        return foto;    }

    public void setFoto(String foto) {        this.foto = foto;    }

    public String getNombre() {        return nombre;    }

    public void setNombre(String nombre) {        this.nombre = nombre;    }

    public int getEdad() {        return edad;    }

    public void setEdad(int edad) {        this.edad = edad;    }

    public int getPc1() {        return pc1;    }

    public void setPc1(int pc1) {        this.pc1 = pc1;    }

    public int getPc2() {        return pc2;    }

    public void setPc2(int pc2) {        this.pc2 = pc2;    }

    public int getPc3() {        return pc3;    }

    public void setPc3(int pc3) {        this.pc3 = pc3;    }

    public int getEf() {        return ef;    }

    public void setEf(int ef) {        this.ef = ef;    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void mostrarInformacion(boolean mostrarFoto) {
        mostrarInformacion();
        if (mostrarFoto) {
            System.out.println("Foto: " + foto);
        }
    }

    public void mostrarInformacion(int mostrarCalificaciones) {
        mostrarInformacion();
        int promedio = (pc1 + pc2 + pc3 + ef) / 4;
        System.out.println("Calificaciones: PC1=" + pc1 + ", PC2=" + pc2 + ", PC3=" + pc3 + ", EF=" + ef);
        System.out.println("Promedio: " + promedio);
    }

    public void mostrarInformacion(String mensaje) {
        System.out.println(mensaje);
        mostrarInformacion();
    }

    public static void mostrarListaAlumnos() {
        for (Alumno alumno : listaAlumnos) {
            alumno.mostrarInformacion();
            System.out.println("----------------------");
        }
    }
}
