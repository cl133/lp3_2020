/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author laurachavez
 */
public class Persona {
    public String Apellido;
    public String Nombre;
    public int Edad;

    public Persona(String Apellido, String Nombre, int Edad) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public void imprimir(){
        System.out.println("Apellido: "+getApellido()+"\n"+"Nombre: "+getNombre()+"\n"+"Edad: "+getEdad());
        System.out.println("---------------");
        
    }
    
}
