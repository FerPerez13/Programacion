//Ejercicio2 Practica1. Fernando Pérez Andrés
package Practica1;

public class Circulo {
    private Punto punt;
    private double rad;
  
    //Constructores
    public Circulo(){
        punt=new Punto();
        rad=0;
    }
    public Circulo(Punto p, double r){
        punt=p;
        rad=r;
    }
    public Circulo(double x, double y, double r){
        punt=new Punto(x,y);
        rad=r;
    }
    
    //Gets
    public Punto getPunto(){
        return punt;
    }
    public double getRadio(){
        return rad;
    }
    
    public double calcularDistanciaDesde(Punto p){
        //Distancia desde el punto hasta el centro del circulo.
        double dist;
        dist=Math.sqrt(Math.pow(p.getValorX()-punt.getValorX(), 2)+Math.pow(p.getValorY()-punt.getValorY(), 2));
        return dist;
    }
    
    public double calcularArea(){
        double area; 
        area=2*Math.PI*Math.pow(rad, 2);
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro;
        perimetro=2*Math.PI*rad;
        return perimetro;
    }
}
