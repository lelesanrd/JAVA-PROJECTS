package com.lleonardo07.habilidades.otras.bbdd.jdbc.test;

import com.lleonardo07.habilidades.otras.bbdd.jdbc.datos.Persona;
import com.lleonardo07.habilidades.otras.bbdd.jdbc.datos.PersonaJDBC;
import java.util.List;

/**
 *
 * @author Leand
 */
public class ManejoPersonas {
    
    public static void main(String[] args) {
        
        //1: Creamos nuestro objeto PersonaJDBC que contiene nuestras sentencias
        PersonaJDBC personaJDBC = new PersonaJDBC();
        
        //2: Creamos una lista, dado que este será la forma en como nos devolvera la sentencia y/o el objeto
        List<Persona> personas = personaJDBC.select();
        
        //========================= SELECT =========================
        //3: Iteramos este resultado
        //Ejemplo 1: con expresiones Lambda, java 8
        personas.forEach( (klk)-> {
            System.out.println("========== JAVA 8: LAMBDA ===========");
            System.out.println( "Persona: " + personas );
            System.out.println("");
            System.out.println("");
        });
        
        //Ejemplo 2: 
        personas.stream().map((persona) -> {
            System.out.println("========== JAVA 8: stream ===========");
            return persona;
        }).forEachOrdered((persona) -> {
            System.out.println( "Persona: " + persona );
            System.out.println("");
        });

        //Ejemplo 3: Tradicional
        for(Persona persona : personas){
            System.out.println("========== TRADICIONAL ===========");
            System.out.println( "Persona: " + persona );
            System.out.println("");
        }
        
        //========================= INSERT =========================
        //Creamos un nuevo objeto tipo persona
//        Persona p = new Persona();
//        
//        //Agregamos los datos a insertar
//        //OPCIONAL: como el ID se autoincrementa, no es necesario agregarlo.
//        p.setNombre("Otto");
//        p.setApellido("López");
//        p.setEmail("o.l@bla.com");
//        p.setTelefono("1234");
//        
//        //Ejecutamos el método insert
//        personaJDBC.insert(p);
        
        System.out.println("");
        
        //========================= UPDATE =========================
         //Creamos un nuevo objeto tipo persona
//        Persona p = new Persona();
//        
//        //Agregamos los datos a insertar
//        //OPCIONAL: como el ID se autoincrementa, no es necesario agregarlo.
//        p.setId_persona(8);
//        p.setNombre("Adam");
//        p.setApellido("López");
//        p.setEmail("a.l@bla.com");
//        p.setTelefono("123");
//        
//        //Ejecutamos el método update
//        personaJDBC.update(p);
        
        
        //========================= DELETE =========================
         //Creamos un nuevo objeto tipo persona
        Persona p = new Persona();
        
        //Agregamos los datos a insertar
        //OPCIONAL: como el ID se autoincrementa, no es necesario agregarlo.
        p.setId_persona(8);
        
        //Ejecutamos el método update
        personaJDBC.delete(p);
        
    }
}
