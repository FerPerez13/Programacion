// Ejercicio 2: Fernando Pérez Andrés
package Examen;

import java.util.*;

public class Matriz5x7 {
    public static void main(String args[]){
        Random rnd = new Random();
        int[][] M=new int[5][7];
        
        //Rellenamos la matriz con valores aleatorios
        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[i].length;j++){
                M[i][j]=rnd.nextInt(10); // El random que llegue hasta 10 para que sea más fácil de visualizar
            }
            System.out.println(Arrays.toString(M[i]));
        }
        System.out.println("          ^-----^");
        System.out.println(); //Salto de línea
        System.out.println("          v-----v");
        
        // Intercambiamos la columna 4 por la columna 6
        int aux;
        for(int i=0; i<M.length; i++){
            aux = M[i][3];
            M[i][3] = M[i][5];
            M[i][5] = aux;
            System.out.println(Arrays.toString(M[i]));
        }
    }
}
