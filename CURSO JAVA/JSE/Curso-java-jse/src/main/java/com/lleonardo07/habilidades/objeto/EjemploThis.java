package com.lleonardo07.habilidades.objeto;

import lombok.Data;

/**
 * Uso de la palabra this
 * @author Leand
 */
public class EjemploThis {
    public static void main(String[] args) {
        Persona p = new Persona(" Leandro");
    }
}

@Data
class Persona{
    //Nombre del atributo
    String nombre;
    
    //Constructor de la clase
    Persona(String nombre){
        this.nombre = nombre;
        System.out.println("Imprimiendo el operador this, dentro de la clase persona: " + this);
        System.out.println("=====================");
        
        //Método para imprimir valores y ejemplo del uso del this
        imprimir i = new imprimir();
        i.imprimir(this); //This, objeto de la persona actual
        
        //o también
        //Método para imprimir valores y ejemplo del uso del this
        imprimirPersona ip = new imprimirPersona();
        ip.imprimirPersona(this); //This, objeto de la persona actual
    }
}

@Data
class imprimir{
    //Método para imprimir y ejemplo...
    public void imprimir(Object cualquierObjeto){ //object nos sirve como comodin y almacena su referencia...
        System.out.println("Imprimir parametro: " + cualquierObjeto); //el parametro es el objeto persona.
        System.out.println("Imprimir objeto actual (this): " + this); ///this, es el objeto, en este caso el método imprimir (actual), porque estamos dentro de esta clase, por tanto solo va imprimir el objeto como tal..
        System.out.println("=====================");
    }
}

// o también
@Data
class imprimirPersona{
    //Método para imprimir y ejemplo...
    public void imprimirPersona(Persona persona){ //Objwcto tipo Persona
        System.out.println("Imprimir parametro: " + persona); //el parametro es el objeto persona.
        System.out.println("Imprimir objeto actual (this): " + this); ///this, es el objeto, en este caso el método imprimir (actual), porque estamos dentro de esta clase, por tanto solo va imprimir el objeto como tal..
    }
}