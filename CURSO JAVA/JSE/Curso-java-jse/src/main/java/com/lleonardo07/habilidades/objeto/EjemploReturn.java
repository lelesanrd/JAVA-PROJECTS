package com.lleonardo07.habilidades.objeto;

/**
 * Ejemplo de uso de la palabra return en objetos
 * @author Leand
 */
public class EjemploReturn {
    
    public static void main(String[] args) {
        Suma s = crearObjetoSuma();
        System.out.println("El resultado de llamar el método sumar es: "+ s.sumar());
    }
    
    //Creamos un metodo de tipo suma
    private static Suma crearObjetoSuma(){
        return new Suma(4, 6);
        /*o también
        Suma suma = new Suma(4,6);
        return suma
        */
    }
}

//Creamos una clase, para no estar creando tantos archivos
//Nota: Recuerda que solo puede existir una clase *publica*
class Suma{
    int a, b;
    
    public Suma(int a, int b ){
        this.a = a;
        this.b = b;
    }
    
    public int sumar(){
        return this.a + this.b;
    }
}