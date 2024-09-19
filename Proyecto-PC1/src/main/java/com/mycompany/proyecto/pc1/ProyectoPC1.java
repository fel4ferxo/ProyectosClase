/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto.pc1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Computadora
 */
public class ProyectoPC1 {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        
        Empleado empleado1 = new Empleado(
                1,                  
                "12345678",         
                "Carlos",           
                "Pérez",            
                "Gómez",            
                2500.00,            
                formatoFecha.parse("1995/10/31") 
            );

            
            Empleado empleado2 = new Empleado(
                2,                  
                "87654321",         
                "Ana",              
                "Rodríguez",        
                "López",            
                3200.00,            
                formatoFecha.parse("1988/04/15") 
            );
        
            System.out.println("\n\nEmpleado 2");
            System.out.println(empleado1.getNombreCompleto());
            System.out.println(empleado1.getSalarioAnual());
            System.out.println(empleado1.aumentarSalario(0.5));
            System.out.println(empleado1.toString());

            System.out.println("Empleado 2");
            System.out.println(empleado2.getNombreCompleto());
            System.out.println(empleado2.getSalarioAnual());
            System.out.println(empleado2.aumentarSalario(0.6));
            System.out.println(empleado2.toString());
        
    }
}
