package com.lleonardo07.habilidades.otras.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Leand
 */
public class prueba {

    public static void main(String[] args) {

        //No permite elementos duplicados y es una lista ordenada
        System.out.println("=========== SET ================");
        Set listSET = new HashSet();
        listSET.add("Lleonardo07");
        listSET.add("Hola");
        listSET.add("Lleonardo07");
        listSET.add("Ola");
        imprimir(listSET);

        //Si permite elementos duplicados y es una lista no ordenada
        System.out.println("=========== LIST =================");
        List<String> list = new ArrayList();
        list.add("Lleonardo07");
        list.add("Hola");
        list.add("Lleonardo07");
        list.add("Ola");
        imprimir(list);
        
        //Si permite elementos duplicados y es una lista no ordenada
        System.out.println("=========== MAP =================");
        Map miMap = new HashMap();
        miMap.put(1, "Hola");
        miMap.put(2, "Lleonardo07");
        miMap.put(3, "Hola");
        //imprimir las llaves, no se respeta el orden
        imprimir(miMap.keySet());
        //Imprimir valores
        imprimir(miMap.values());
        //Obtener un valor especifico...
        System.out.println("Obtener un valor especifico: " + miMap.get(2));
    }

    //Esto no es recomendable, pero es a modo de ejemplo
    private static void imprimir(Collection list) {
        for (Object miLista : list) {
            System.out.println("Mi lista: " + miLista);
        }

        list.forEach((miLista) -> {
            System.out.println("Mi lista con Java 8, LAMBDA: " + miLista);
        });
    }
}
