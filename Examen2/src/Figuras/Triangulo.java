
package Figuras;


public class Triangulo extends Figura{
    
    private double area;
    public Triangulo(double ancho, double alto) {
        super(ancho, alto);
    }

    public double getAncho(){
        return super.getAncho();
    }
    public double getAlto(){
        return super.getAlto();
    }
      
    public double getArea(){
        this.area=(getAlto()*getAncho())/2;
        return area;
    }
    
}
