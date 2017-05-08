
package Figuras;

import java.util.LinkedList;
import java.util.Scanner;



public abstract class Figura {
    
    private double ancho;
    private double alto;
    private double area;
   
    
    Figura(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public abstract double getArea();


    public void imprimirDatos(){
        System.out.println("Ancho: "+ this.ancho);
        System.out.println("Alto: "+ this.alto);
    }
    
}
