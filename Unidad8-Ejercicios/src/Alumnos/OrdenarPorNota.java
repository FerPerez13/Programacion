
package Alumnos;

import java.util.*;

public class OrdenarPorNota implements Comparator{
    
    public int compare(Object alum1, Object alum2){
        
        Alumno a1 = (Alumno) alum1;
        Alumno a2 = (Alumno) alum2;
        
        if(a1.getNotaMedia()>a2.getNotaMedia()){
            return -1;
        }else if(a1.getNotaMedia()<a2.getNotaMedia()){
            return 1;
        }else{
            return 0;
        }
    }
    public boolean equals(Object o){
        return this == o;
    }
}
