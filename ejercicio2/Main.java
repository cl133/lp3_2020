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

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona=new Persona("Martinez","Maria",47);
        Persona persona2=new Persona("Morel","Mario",23);
        Persona persona3=new Persona("Amarilla","Andres",10);
        
        persona.imprimir();
        persona2.imprimir();
        persona3.imprimir();
    }
    
}
