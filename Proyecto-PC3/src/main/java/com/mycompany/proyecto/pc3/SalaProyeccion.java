/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.pc3;

/**
 *
 * @author Computadora
 */
public class SalaProyeccion {
    
    private int codigo;
    private String nombre;
    public Ubicacion ubicacion;
    private int aforo;
    private int numPuertasEntrada;
    private int numPuertasSalida;

    public SalaProyeccion() {
    }

    public SalaProyeccion(int codigo, String nombre, Ubicacion ubicacion, int aforo, int numPuertasEntrada, int numPuertasSalida) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.aforo = aforo;
        this.numPuertasEntrada = numPuertasEntrada;
        this.numPuertasSalida = numPuertasSalida;
    }

    public int getCodigo() {        return codigo;    }

    public void setCodigo(int codigo) {        this.codigo = codigo;    }

    public String getNombre() {        return nombre;   }

    public void setNombre(String nombre) {        this.nombre = nombre;    }

    public Ubicacion getUbicacion() {        return ubicacion;    }

    public void setUbicacion(Ubicacion ubicacion) {        this.ubicacion = ubicacion;    }

    public int getAforo() {        return aforo;    }

    public void setAforo(int aforo) {        this.aforo = aforo;    }

    public int getNumPuertasEntrada() {        return numPuertasEntrada;    }

    public void setNumPuertasEntrada(int numPuertasEntrada) {        this.numPuertasEntrada = numPuertasEntrada;    }

    public int getNumPuertasSalida() {        return numPuertasSalida;    }

    public void setNumPuertasSalida(int numPuertasSalida) {        this.numPuertasSalida = numPuertasSalida;    }
    
    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Ubicación: " + ubicacion + 
               ", Aforo: " + aforo + ", Puertas de Entrada: " + numPuertasEntrada + 
               ", Puertas de Salida: " + numPuertasSalida;
    }
}
