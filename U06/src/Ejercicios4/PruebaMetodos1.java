// Ejercicios ARRAYS UNIDIMENSIONALES. Fernando Pérez Andrés    

package Ejercicios4;

import java.util.*;
import java.math.*;

public class PruebaMetodos1 {
    static Random rnd = new Random();
    
    @SuppressWarnings("empty-statement")
    public static void main(String args[]){
        
        // 1) Prueba
        int[] a = new int[10];
        System.out.println("1)");
        mostrarArrayPantalla2(a);
        
        // 2) Prueba
        int[] b = new int[10];
        System.out.println("2)");
        mostrarArrayComoString(b);
        
        // 3) Prueba
        int[] c = {1,3,4,5,0,7,9,0,0,1};
        System.out.println("3)");
        completarArray3(c);
        System.out.println(Arrays.toString(c));
        
        // 4) Prueba
        int[] d = {1,3,4,5,0,7,9,0,0,1};
        System.out.println("4)");
        System.out.println(obtenerSumaArray(d));
        
        // 5) Prueba
        System.out.println("5)");
        System.out.println(Arrays.toString(arrayPotencias2(10)));
        
        // 6) Prueba
        System.out.println("6)");
        String[] v = {"hola", "me", "llamo", "Fernando"};
        System.out.println(concatArray(v));
    
        // 7) Prueba
        System.out.println("7)");
        System.out.println(obtenerSumaLongCadArray(v));
        
        // 8) Prueba
        System.out.println("8)");
        System.out.println(Arrays.toString(obtenerLongCadenas(v)));
    
    }
    
    // 1
    public static void mostrarArrayPantalla2(int[] v){
        for (int i=0; i<v.length; i++){
            System.out.print(v[i]);
            if(i != v.length-1){
                System.out.print(" , ");
            }else{
                System.out.println();
            }
        }
    }
    
    // 2
    public static void mostrarArrayComoString(int[] v){
        for (int i=0; i<v.length; i++){
            System.out.print(v[i]);
            if(i != v.length-1){
                System.out.print(" ");
            }else{
                System.out.println();
            }
        }
    }
    
    // 3
    public static void completarArray3(int[] v){
        for(int i=0; i<v.length; i++){
            if(v[i]==0){
                v[i]= rnd.nextInt(10);
            }
        }
    }
    
    // 4
    public static int obtenerSumaArray(int[] v){
        int suma=0;
        for(int i=0; i<v.length; i++){
            suma=suma+v[i];
        }
        return suma;
    }
    
    // 5
    public static int[] arrayPotencias2(int i){
        int[] v = new int[i];
        for(int j=1; j<v.length; j++){
            int num = (int) Math.pow(2, j);
            v[j]=num;
        }
        return v;
    }
    
    // 6
    public static String concatArray(String[] v){
        String str = "";
        for(int i=0; i<v.length; i++){
            str = str+v[i]+" ";
        }
        return str;
    }
    
    // 7
    public static int obtenerSumaLongCadArray(String[] v){
        int cont=0;
        for (int i=0; i<v.length; i++){
            cont = cont + v[i].length();
        }
        return cont;
    }   
    
    
    // 8 
    public static int[] obtenerLongCadenas(String[] v){
        int[] cont = new int[v.length];
        for(int i=0; i<v.length; i++){
            cont[i] = v[i].length();
        }
        return cont;
    }
    
    
}
