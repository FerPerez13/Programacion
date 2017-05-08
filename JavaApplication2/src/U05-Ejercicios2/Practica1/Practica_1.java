// ejercicio 4 Practica 1. Fernando Pérez Andrés

package Practica1;

import java.util.*;

public class Practica_1 {
    public static void main(String args[]){
        Scanner tcl=new Scanner(System.in);
        
        System.out.println("### Punto ###");
        Punto p1=new Punto();
        Punto p2=new Punto();
        System.out.println("Dime el valor de X:");
        p2.setValorX(tcl.nextDouble());
        System.out.println("Dime el valor de Y:");
        p2.setValorY(tcl.nextDouble());
        System.out.println("La distancia de P2 respecto al origen es de: "+Punto.calcularDistanciaDesde(p2));
        System.out.println("");
        
        System.out.println("### Circulo ###");
        Circulo C1=new Circulo(p2,2);
        System.out.println("El area es: "+C1.calcularArea());
        System.out.println("El perimetro es: "+C1.calcularPerimetro());
        System.out.println("La distancia al punto P1=(0,0) es: "+C1.calcularDistanciaDesde(p1));
        System.out.println("");
        
        System.out.println("### Triangulo ###");
        Triangulo T1=new Triangulo();
        System.out.println("El area de el Triangulo es: "+T1.calcularArea());
        System.out.println("El perimetro del Triangulo es: "+T1.calcularPerimetro());
        System.out.println("La distancia minima desde el Triangulo al punto P1=(0,0) es:"+T1.calcularDistanciaDesde(p1));
        System.out.println("");
        
    }

}
