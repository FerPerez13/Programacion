// Ejercicio 6. Fernando Pérez Andrés 

package U06Ejercicios3;

import java.util.*;

public class NotasGrupo {
    public static void main (String args[]){
        Random rnd = new Random();
        int[][] grupo = new int[20][4];
        
        for(int i=0; i<20; i++){ // Rellenar la primera columna que será la de identificador del alumno
            grupo[i][0]=i+1;
        }
        
        for(int i=0;i<20; i++){ // Rellenar el resto de las columnas con las notas de los alumnos
            for(int j=1; j<4; j++){
                grupo[i][j]=rnd.nextInt(11);
            }
            System.out.println(Arrays.toString(grupo[i]));
        }
        
        System.out.println("");
        
        // Nota média de cada alumno: 
        
        int[][] NotaMedia = new int[20][2];
        
        for(int i=0; i<20; i++){
            float media = 0;
            for(int j=1; j<4; j++){
                media = media + grupo[i][j];
            }
            media = media / 3;
            System.out.println("La media del alumno "+(i+1)+" es : "+media);
        }
        
        System.out.println("");
        
        // Máxima nota de cada módulo

        for(int j=1; j<4; j++){
            int notaMax=-1;
            for(int i=0; i<20; i++){
                if(grupo[i][j]>notaMax){
                    notaMax = grupo[i][j];
                }
            }
            System.out.println("La nota máxima del módulo "+j+" es: "+notaMax);
        }
        
        System.out.println("");
        
        // Nota média por grupo y cuantos la superan
        
        for(int j=1; j<4; j++){
            int notaMedia=0;
            for(int i=0; i<20; i++){
                notaMedia = notaMedia + grupo[i][j];
            }
            notaMedia=notaMedia/20;
            System.out.println("El módulo "+j+" tiene una nota media de :"+notaMedia);
            
            int contador=0;
            for(int i=0; i<20; i++){
                if(grupo[i][j]>notaMedia){
                    contador++;
                }
            }
            System.out.println("Hay "+contador+" alumnos que superan la nota media de "+notaMedia);
            System.out.println("");
        }
    }
}
