
package Revision2;

import java.util.*;

public class Poligono {
    
    private Punto[] poligono;

    public Poligono(Punto[] poligono) {
        this.poligono = poligono;    
    }
    
    public void trasladar(int desx, int desy){
        /*desx=Desplazamiento de las X | desy=Desplazamiento de las Y*/
        
        //Trasladamos todas las X
        for(int i=0; i<this.poligono.length;i++){
            int actual = poligono[i].getX();
            int nuevo = actual + desx;
            poligono[i].setX(nuevo);
        }
        //Trasladamos todas las Y
        for(int i=0;i<this.poligono.length;i++){
            int actual = poligono[i].getY();
            int nuevo = actual + desy;
            poligono[i].setY(nuevo);
        }
    }
    
    public void escalar(int escX, int escY){
        /*Introducimos los valores de escala para las coordenadas de el 
        poligono. Ejemplos:  0.5 reducimos a la mitad   
        1.5 Augmentamos la mitad    2 doblamos la distancia*/
        
        //Escalamos todas las X
        for(int i=0; i<this.poligono.length;i++){
            int actual = poligono[i].getX();
            int nuevo = actual * escX;
            poligono[i].setX(nuevo);
        }
        //Escalamos todas las Y
        for(int i=0;i<this.poligono.length;i++){
            int actual = poligono[i].getY();
            int nuevo = actual * escY;
            poligono[i].setY(nuevo);
        } 
    }
    
    public int numVertices(){
        return poligono.length;
    }
    
    @Override
    public String toString(){
        String str = "";
        for(int i=0; i<poligono.length;i++){
            str = str + poligono[i].toString()+"\n";
        }
        return str;
    }
    
    public double perimetro(){
        double perimetro=0;
        for(int i=0; i<(poligono.length)-1;i++){
            Punto p1 = poligono[i];
            Punto p2 = poligono[i+1];
            double dist = p1.distancia(p2);
            perimetro = perimetro + dist;
        }
        Punto p1 = poligono[poligono.length-1];
        Punto p2= poligono[0];
        double dist = p1.distancia(p2);
        perimetro =  perimetro + dist;
        return perimetro;
    }
    
}
