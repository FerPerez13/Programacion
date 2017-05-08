//Ejercicio 2 Practica 3. Fernando Pérez Andrés
package Practica3;


public class Coche {
    private Motor motor=new Motor();
    private String marca;
    private String modelo;
    double precioAverias;
    
    public void Coche(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
    
    public void setAcumularAveria(double precio){
        precioAverias=precioAverias+precio;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public Motor getMotor(){
        return motor;
    }
    public double getPrecioAverias(){
        return precioAverias;
    }
    
    
}
