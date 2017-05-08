package Practica4;

// Ejercicio 2. Fernando Pérez Andrés

import java.util.Scanner;
import java.lang.Math;

public class AreaLong {
    
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        double radio;
        System.out.println("Dime el rádio de la circunferencia:");
        radio=tcl.nextDouble();
        System.out.println("El área de la circunferencia de radio="+radio+" es de "+area(radio));
        System.out.println("La longitud de la circunferencia de radio="+radio+" es de "+longitud(radio));
    }

    public static double area(double rad) {
        double area;
        area=Math.PI*rad*rad;
        return area;        
    }
    
    public static double longitud(double rad){
        double longit;
        longit=2*Math.PI*rad;
        return longit;
    }
}
