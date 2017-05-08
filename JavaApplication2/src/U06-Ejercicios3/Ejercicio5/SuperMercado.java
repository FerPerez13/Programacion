// Ejercicio 5. Fernando Pérez Andrés

package U06Ejercicios3;

import java.util.*;


public class SuperMercado {
    public static void main (String args[]){
        Random rnd = new Random();
        
        int[][] A = new int[100][2];
        int[][] B = new int[50][2];
        
        // Rellenamos A con elementos
        for(int i=0; i<100; i++){ //Nº Productos
            A[i][0]=rnd.nextInt(100);
        }
        for(int i=0; i<100; i++){ //Precio
            A[i][1]=rnd.nextInt(20);
        }
        
        // Rellenamos B
        float[] preciosMedios=new float[50];
        
        for(int i=0; i<50; i++){ //Nº Productos
            B[i][0]=i;
        }
        
        for(int i=0; i<50; i++){ // Cantidad de veces que se repite el Nº de Producto en A mas calcular su precio médio. 
            int cont=0;
            int precioMedio=0; // Necesario Para calcular el precio medio del producto
            for(int ii=0; ii<100; ii++){
                if(A[ii][0]==i){
                    cont++;
                    precioMedio = precioMedio + A[ii][1];
                }
            }
            B[i][1]=cont; 
            if(cont!=0){
                preciosMedios[i]=precioMedio/cont;
            }
        }
        
        //Calculo del importe
        
        float[] importe = new float[50];
        float importeTotal=0;
        for(int i=0; i<50; i++){
            importe[i]=B[i][1]*preciosMedios[i];
            importeTotal = importeTotal + importe[i];
        }
        
        // CRear la lista
        
        System.out.println("Nº de Producto    Cantidad    Precio    Importe");
        System.out.println("---------------------------------------------------");
        for(int i=0; i<50; i++){
            if(B[i][1]!=0){
                System.out.println(B[i][0]+"                 "+B[i][1]+"           "+preciosMedios[i]+"          "+importe[i]);
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.println("TOTAL ____________________________________"+importeTotal+"€");
             
        
    }
    
}
