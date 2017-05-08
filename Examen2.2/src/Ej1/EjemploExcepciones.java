/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

import java.util.*;

public class EjemploExcepciones {
    
    public static int devuelveEntero(int num){
        try{
            if (num % 2 == 0){
                throw new Exception("Lanzando excepción");
            }
            return 1;
        }catch(Exception e){
            return 2;
        }
        finally{
            return 3;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(devuelveEntero(1));
    }
    
}
