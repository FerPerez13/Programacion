//Ejercicio 1 Practica 1. Fernando Pérez Andrés
package Practica1;

public class Punto {
    private double x;
    private double y;
    
    public Punto(){
        x=0;
        y=0;
    }
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public void setValorX(double num){
        this.x=num;
    }
    public void setValorY(double num){
        this.y=num;
    }
    public double getValorX(){
        return this.x;
    }
    public double getValorY(){
        return this.y;
    } 
    
    public static double calcularDistanciaDesde(Punto p){
        // Calcula distancia desde el punto P al origen (0,0). 
        double dist;
        dist=Math.sqrt(Math.pow(p.getValorX(), 2)+Math.pow(p.getValorY(),2));
        return dist; 
    }
        
}
