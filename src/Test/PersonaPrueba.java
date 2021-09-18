/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import domain.Persona;

/**
 *
 * @author INDRA
 */
public class PersonaPrueba {
    private int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
          
        Persona persona2 = new Persona("Karla");
        imprimir(persona1);
        imprimir(persona2);
        
//        this.contador = 10;
    }
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Jose"));
        return this.contador;
    }
}
