/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.pc3;

/**
 *
 * @author Computadora
 */
public class Ubicacion {
    public int piso;
    public int pasillo;
    public int puerta;

    public Ubicacion() {
    }

    public Ubicacion(int piso, int pasillo, int puerta) {
        this.piso = piso;
        this.pasillo = pasillo;
        this.puerta = puerta;
    }

    public int getPiso() {        return piso;    }

    public void setPiso(int piso) {        this.piso = piso;    }

    public int getPasillo() {        return pasillo;    }

    public void setPasillo(int pasillo) {        this.pasillo = pasillo;    }

    public int getPuerta() {        return puerta;    }

    public void setPuerta(int puerta) {        this.puerta = puerta;    }    
    
    
    @Override
    public String toString() {
        return "Piso: " + piso + ", Pasillo: " + pasillo + ", Puerta: " + puerta;
    }
}
