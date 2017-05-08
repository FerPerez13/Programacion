// Ejercicio 2. Fernando Pérez Andrés
package U06Ejercicios3;

import java.util.*;

public class Matriz7x5 {
    public static void main(String args[]){
        Random rnd=new Random();
        int[][] matrix = new int[7][5];
        System.out.println("Esta es la matriz:");
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix[1].length;j++){
                matrix[i][j]=rnd.nextInt(10);
            }
            
            System.out.println(Arrays.toString(matrix[i]));
        }
        
        System.out.println("Esta es la nueva matriz 7x7:");
        int[][] mat = new int[7][7];
        for (int i=0; i<mat.length; i++){ // i=filas
            for(int j=0; j<mat.length; j++){ // j=columnas
                if(i<7 && j<5){ // Copiamos la matriz Origen en la 7x5
                    mat[i][j]=matrix[i][j];
                }
                
                if(j==5){  // En la sexta columna metemos la suma de los elementos de la fila de la Matrix
                    int suma=0;
                    for (int u=0; u<matrix.length; u++){ // u=filas
                        for(int v=0; v< matrix[1].length;v++){ //v=columnas
                            suma=suma+matrix[u][v];
                        }
                        mat[u][5]=suma;
                        suma=0;
                    }
                }
                
                if(j==6){ // En la septima columna calculamos la media de las filas de la Matrix
                    int suma=0;
                    for (int u=0; u<matrix.length; u++){ // u=filas
                        for(int v=0; v< matrix[1].length;v++){ //v=columnas
                            suma=suma+matrix[u][v];
                        }
                        suma=suma/5;
                        mat[u][6]=suma;
                        suma=0;
                    }
                }
            }
            System.out.println(Arrays.toString(mat[i]));
        }
        
        
    }
}
