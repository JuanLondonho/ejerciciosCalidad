/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SALASDRAI
 */
public class Pruebas {
    
    public Pruebas() {
    }
    @Test
    public void suma (){
       try{ 
            float result = Calculadora.suma(5,5);
            assertEquals(11, result, 0.01);
       }catch(Exception e){
            System.out.println(e.getMessage());
       }
    }
    @Test
    public void resta (){
       try{
            float result = Calculadora.resta(10,8);
            assertEquals(10, result, 0.01);
       }catch(Exception e){
            System.out.println(e.getMessage());
       }
    }
    @Test
    public void potencia (){
        try{
            double result = Calculadora.potencia(5,8);
            assertEquals(10, result, 0.01);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void log (){
        try{
            double result = Calculadora.log(5,8);
            assertEquals(10, result, 0.01);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void multiplicacion (){
        try{
            double result = Calculadora.multiplicacion(5,8);
            assertEquals(10, result, 0.01);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void division (){
        try{
            double result = Calculadora.division(5,8);
            assertEquals(10, result, 0.01);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void porcentaje (){
        try{
            double result = Calculadora.porcentaje(5,8);
            assertEquals(10, result, 0.01);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
