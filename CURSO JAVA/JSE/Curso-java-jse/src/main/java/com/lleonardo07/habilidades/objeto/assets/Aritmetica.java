package com.lleonardo07.habilidades.objeto.assets;
/**
 *
 * @author Leand
 */
public class Aritmetica {
    
    private int a;
    private int b;
    
    public Aritmetica(){
        System.out.println("Este es un constructor vacio");
    }
    
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Este es un constructor con argumentos");
    }
    
    public void sumar(){
        System.out.println("El resultado de la suma es: " + (a + b));
    }
    
    public void restar(){
        System.out.println("El resultado de la resta es: " + (a - b)) ;
    }
    
    public int multiplicar(int a, int b){
        System.out.println("El resultado de la multiplicación es: " + (a * b));
        return 0;
    }
    
    public int dividir(int a, int b){
       
        try {
            System.out.println("El resultado de la división es: " + (a / b));
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        finally{
            System.out.println(" ========== Recuerda que no puedes dividir por 0, esto aplicar a la segunda variable ========= "); 
        }
        return 0;
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Aritmetica{" + "a=" + a + ", b=" + b + '}';
    }
}
