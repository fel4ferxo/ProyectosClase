/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaaluno;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class Alumno {
    private String foto;
    private String nombre;
    private int edad;
    private int pc1;
    private int pc2;
    private int pc3;
    private int ef;  

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
    
    public String VerPantalla (String nombre, String foto, int edad,  int pc1, int pc2, int pc3, int ef)   {
        String mensaje = "";    
        
        mensaje += "---\n";
        mensaje += "Nombre: " + nombre + "\n";
        mensaje += "Foto (Ubicacion): " + foto + "\n";
        mensaje += "Edad: " + edad + "\n";
        mensaje += "Notas: \n";
        mensaje += "    - Pc1 : " + pc1 + "\n";
        mensaje += "    - Pc2 : " + pc2 + "\n";
        mensaje += "    - Pc3 : " + pc3 + "\n";
        mensaje += "    - Ef : " + ef + "\n";
        mensaje += "---";
                
        return mensaje;
    }
    
    public int CalcularPromedio (int pc1, int pc2, int pc3, int ef) {
        int promedio = 0;
        
        promedio = (pc1+pc2+pc3+ef)/4;
        
        return promedio;
    }
         
}




