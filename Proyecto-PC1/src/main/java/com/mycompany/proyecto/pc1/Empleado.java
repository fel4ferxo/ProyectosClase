/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.pc1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Computadora
 */
public class Empleado {

    private int  id;
    private String DNI;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private double salario;
    private Date fechaNacimiento;
    
    public Empleado() {}
    
    public Empleado(int id, String DNI, String nombre, String apellidoPaterno, String apellidoMaterno, double salario, Date fechaNacimiento) {
        this.id = id;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {        return id;    }

    public void setId(int id) {        this.id = id;    }

    public String getDNI() {        return DNI;    }

    public void setDNI(String DNI) {        this.DNI = DNI;    }

    public String getNombre() {        return nombre;    }

    public void setNombre(String nombre) {        this.nombre = nombre;    }

    public String getApellidoPaterno() {        return apellidoPaterno;    }

    public void setApellidoPaterno(String apellidoPaterno) {        this.apellidoPaterno = apellidoPaterno;    }

    public String getApellidoMaterno() {        return apellidoMaterno;    }

    public void setApellidoMaterno(String apellidoMaterno) {        this.apellidoMaterno = apellidoMaterno;    }

    public double getSalario() {        return salario;    }

    public void setSalario(double salario) {        this.salario = salario;    }

    public Date getFechaNacimiento() {        return fechaNacimiento;    }

    public void setFechaNacimiento(Date fechaNacimiento) {        this.fechaNacimiento = fechaNacimiento;    }
    
    public String getNombreCompleto() {
        String mensaje = "";
        mensaje += apellidoPaterno + " " + apellidoMaterno + "\n";
        mensaje += nombre;
        
        return mensaje;
    }
    
    public double getSalarioAnual() {
        double salarioAnual = salario * 12;       
        
        return salarioAnual;
    }   
    
    public double aumentarSalario(double porcentaje) {
        double nuevoSalario = salario * (1 + porcentaje);
        
        salario = nuevoSalario;
        return salario;
    }
    
    public String toString () {
        String mensaje = "";
        
         LocalDate fechaNacLocal = fechaNacimiento.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        
        LocalDate fechaActual = LocalDate.now();        
        int edad = Period.between(fechaNacLocal, fechaActual).getYears();
        
        mensaje += "Empleado " + id + ": " + nombre + "\n" + 
                   apellidoPaterno + " " + apellidoMaterno + " -\n" + 
                   edad + "(" + salario + ")";
        
        return mensaje;
    } 
        
}
 