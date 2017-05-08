
package Alumnos;

import java.util.*;


public class OrdenarPorApellido implements Comparator{

    public int compare(Object alum1, Object alum2){

        Alumno a1 = (Alumno) alum1;
        Alumno a2 = (Alumno) alum2;
        
        return a1.getApellidos().compareToIgnoreCase(a2.getApellidos());
    }
    
    public boolean equals(Object o){
        return this == o;
    }

}
