/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author SALASDRAI
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(porcentaje(50, -50));
    }
    
    
    public static float suma (float a, float b){
        return a+b;
    }
    
    public static float resta (float a, float b){
        return a-b;
    }
    
    public static double potencia (float x, float n){
        return Math.pow(x,n);
    }
    
    public static double log (float base, float x){
        return (Math.log10(x) / Math.log10(base));
    }
    
    public static double multiplicacion (float x, float y){
        return x*y;
    }
    
    public static float division (float numerador, float denominador){
        if(denominador != 0){
            return numerador / denominador;
        }
        return 0;
    }
    
    public static double raiz (float x, float y){
        if(x >= 0){
          return Math.pow(x, 1/y);  
        }
        return -1;
    }
    
    public static float porcentaje (float x, float y){
        if(x >= 0 && y >= 0){
            return x*y/100;
        }
        return -1;
            
    }
   
}
