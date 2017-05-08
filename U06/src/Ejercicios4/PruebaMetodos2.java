// Ejercicio 2. Fernando Pérez Andrés

package U06Ejercicios4;

import java.util.*;
import java.math.*;

public class PruebaMetodos2 {

    public static void main(String args[]){
        //11
        System.out.println("11)");
        int[][] M = new int[5][5];
        rellenarMatrizSecuencia2D(M);
        for(int i=0; i<M.length; i++){
            System.out.println(Arrays.toString(M[i]));
        }
        System.out.println("");
        //12
        System.out.println("12)");
        mostrarMatrizID(M);
        System.out.println("");
        //13
        System.out.println("13)");
        System.out.println(matrizIntComoString(M));
        System.out.println("");
        //14 
        System.out.println("14)");
        rellenarMatrizAsteriscos(8);
        System.out.println("");
        //15 
        System.out.println("15)");
        System.out.println(obtenerSumaElementosMatriz(M));
        System.out.println("");
        //16
        System.out.println("16)");
        obtenerDiagonales(M);
        System.out.println("");
        //17
        System.out.println("17)");
        obtenerLaterales(M);
        System.out.println("");
        //18
        System.out.println("18)");
        triangularSuperior();
        System.out.println("");
    }
    
    //11
    public static int[][] rellenarMatrizSecuencia2D(int[][] M){
        int cont=0;
        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[i].length;j++){
                M[j][i]=cont+j;
            }
            cont=cont+4;
        }
        return M;
    }
    
    //12
    public static void mostrarMatrizID(int[][] M){
        for(int i=0; i<M.length; i++){
            System.out.println(Arrays.toString(M[i]));
        }
                
    }
    
    //13
    public static String matrizIntComoString(int[][] M){
        String Mstring = "{";
        for(int i=0; i<M.length;i++){
            Mstring = Mstring + Arrays.toString(M[i]) + ",";
        }
        Mstring = Mstring + "}";
        return Mstring;
    }
    
    //14
    public static void rellenarMatrizAsteriscos(int n) {
        char[][] piram = new char[n][(n * 2) - 1];
        for (int i = 0; i < piram.length; i++) {
            for (int j = 0; j < ((i * 2) + 1); j++) {
                piram[i][((piram[i].length / 2) - i) + j] = '*';
            }
        }

        for (int i = 0; i < piram.length; i++) {
            for (int j = 0; j < piram[i].length; j++) {
                System.out.print(piram[i][j]);
            }
            System.out.println();
        }
    }
    
    //15
    public static int obtenerSumaElementosMatriz(int[][] M){
        int suma=0;
        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[i].length; j++){
                suma=suma+M[i][j];
            } 
        }
        return suma;
    }
    
    //16 
    public static int[][] obtenerDiagonales(int[][] M){
        int[][] D = new int[M.length][M[0].length];
        //Diagonal Principal
        for(int i=0; i<M.length; i++){
                D[i][i]=M[i][i];
        }
        //Diagonal Secundaria
        for(int i=0; i<M.length; i++){
                D[i][(M.length-1)-i]=M[i][(M.length-1)-i];
        }
        //Imprimir por pantalla
        for(int i=0; i<M.length; i++){
            System.out.println(Arrays.toString(D[i]));
        }
        return D;
    }
    
    //17 
    public static int[][] obtenerLaterales(int[][] M){
        int[][] L = new int[M.length][M[0].length];
        
        //Copiamos fila superior e inferior
        for(int i=0; i<M[0].length;i++){
            L[0][i]=M[0][i];
            L[M[0].length-1][i]=M[M[0].length-1][i];
        }
        
        //Copiamos la primera columna
        for(int j=0; j<M.length; j++){
            L[j][0]=M[j][0];
            L[j][M.length-1]=M[j][M.length-1];
        }
        
        //Imprimo L
        for(int i=0;i<L.length;i++){
            System.out.println(Arrays.toString(L[i]));
        }
        return L;
    }
    
    //18
    public static void triangularSuperior(){
        int[][] M = new int[5][5];
        int nums=5;
        for(int i=0; i<M.length;i++){
            for(int j=0;j<nums;j++){
                M[i][j]=j+1;
            }
            nums=nums-1;
            System.out.println(Arrays.toString(M[i]));
        }
    }
}
