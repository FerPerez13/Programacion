//Ejercicio 3 Practica 1. Fernando Pérez Andrés

package Practica1;

public class Triangulo {

    private Punto P1;
    private Punto P2;
    private Punto P3;
    
    public Triangulo(){
        this.P1=new Punto();
        this.P2=new Punto(1,1);
        this.P3=new Punto(0,1);
    }
    
    public Triangulo(Punto p1, Punto p2, Punto p3){
        // Un triangulo diciendo cada punto
        this.P1=p1;
        this.P2=p2;
        this.P3=p3;
    }
    
    public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3){
        // Un triangulo diciendo todas las coordenadas de cada punto
        P1=new Punto(x1,y1);     
        P2=new Punto(x2,y2);
        P3=new Punto(x3,y3);
    }
    
    // GETS
    public Punto getValorP1(){
        return P1;
    }
    public Punto getValorP2(){
        return P2;
    }
    public Punto getValorP3(){
        return P3;
    }
    
    public double calcularDistanciaDesde(Punto p){
        //Distancia desde el punto P hasta el vertice más cercano del Triangulo. 
        
        double dist,distf;
        distf=Math.sqrt(Math.pow(p.getValorX()-P1.getValorX(), 2)+Math.pow(p.getValorY()-P1.getValorY(),2)); // Distancia desde P a P1
        dist=dist=Math.sqrt(Math.pow(p.getValorX()-P2.getValorX(), 2)+Math.pow(p.getValorY()-P2.getValorY(),2)); // Distancia de P a P2
        
        if(dist<distf){ // Comparo distancia de P a P1 con la distancia de P a P2, si es menor la cambio, si no pasamos
            distf=dist;
        }
        
        dist=Math.sqrt(Math.pow(p.getValorX()-P3.getValorX(), 2)+Math.pow(p.getValorY()-P3.getValorY(),2)); // Distancia de P a P3
        
        if(dist<distf){ // Comparamos distf(menor entre P-P1 o P-P2) con la distancia de P a P3, si es menor cambiamos si no sigue igual.
            distf=dist;
        }
        
        return distf; //Devolvemos distf que será la menor distancia de P a uno de los vertices
    }
    
    public double calcularArea(){
        //Calculamos el areal del triangulo
        double area=0;
        double d1,d2,d3;
        d1=Math.sqrt(Math.pow(P1.getValorX()-P2.getValorX(), 2)+Math.pow(P1.getValorY()-P2.getValorY(),2));
        d2=Math.sqrt(Math.pow(P2.getValorX()-P3.getValorX(), 2)+Math.pow(P2.getValorY()-P3.getValorY(),2));
        d3=Math.sqrt(Math.pow(P3.getValorX()-P1.getValorX(), 2)+Math.pow(P3.getValorY()-P1.getValorY(),2));
        
        if(d1>d2 && d1>d3){
            area=(d2*d3)/2;
        }else if(d2>d1 && d2>d3){
            area=(d1*d3)/2;            
        }else if(d3>d1&&d3>d2){
            area=(d1*d3)/2;
        }
        return area;
    }
        
    public double calcularPerimetro(){
        double d1,d2,d3;
        d1=Math.sqrt(Math.pow(P1.getValorX()-P2.getValorX(), 2)+Math.pow(P1.getValorY()-P2.getValorY(),2));
        d2=Math.sqrt(Math.pow(P2.getValorX()-P3.getValorX(), 2)+Math.pow(P2.getValorY()-P3.getValorY(),2));
        d3=Math.sqrt(Math.pow(P3.getValorX()-P1.getValorX(), 2)+Math.pow(P3.getValorY()-P1.getValorY(),2));
        double perimetro=d1+d2+d3;
        return perimetro;
    }
}