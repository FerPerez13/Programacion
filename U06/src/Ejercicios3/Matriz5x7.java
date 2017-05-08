// Ejercicio 1. Fernando Pérez Andrés

package U06Ejercicios3;

import java.util.*;

public class Matriz5x7 {
    public static void main (String args[]){
        Random rnd = new Random();
        int[][] matrix = new int[5][7];
        
        System.out.println("* Esta es la matriz:");
        
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix[1].length;j++){
                matrix[i][j]=rnd.nextInt(10);
            }
            
            System.out.println(Arrays.toString(matrix[i]));
        }
        
        System.out.println("La quinta fila completa es: "+Arrays.toString(matrix[4]));
        
        System.out.println("El elemento de la cuarta fila y tercera columna es: "+ matrix[3][2]);
        System.out.println("El elemento de la quinta fila y tercera columna es: "+matrix[4][2]);
        
        System.out.println("La primera columna: ");
        for(int j=0; j<matrix.length;j++){
            System.out.println(matrix[j][0]);
        }
        System.out.println("La cuarta columna: ");
        for(int j=0; j<matrix.length;j++){
            System.out.println(matrix[j][3]);
        }
        System.out.println("Ahora intercambiamos estas columnas");
        int aux;
        for(int j=0; j<matrix.length;j++){
            aux=matrix[j][0];
            matrix[j][0]=matrix[j][3];
            matrix[j][3]=aux;
        }
        System.out.println("La primera columna modificada: ");
        for(int j=0; j<matrix.length;j++){
            System.out.println(matrix[j][0]);
        }
        System.out.println("La cuarta columna modificada: ");
        for(int j=0; j<matrix.length;j++){
            System.out.println(matrix[j][3]);
        }
    }
}
