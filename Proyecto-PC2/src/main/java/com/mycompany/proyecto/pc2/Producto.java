/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.pc2;

/**
 *
 * @author Computadora
 */
public class Producto {
    public int codigo;
    public String nombre;
    public double precio;
    public String fecha;

    public Producto() {
    } 

    public Producto(int codigo, String nombre, double precio, String fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }

    public int getCodigo() {        return codigo;    }

    public void setCodigo(int codigo) {        this.codigo = codigo;    }

    public String getNombre() {        return nombre;    }

    public void setNombre(String nombre) {        this.nombre = nombre;    }

    public double getPrecio() {        return precio;    }

    public void setPrecio(double precio) {        this.precio = precio;    }

    public String getFecha() {        return fecha;    }
    
    public void setFecha(String fecha) {        this.fecha = fecha;    }
        
    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Precio: $" + precio + ", Fecha de Caducidad: " + fecha;
    }
}
