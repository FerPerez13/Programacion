
package Figuras;


public class Rectangulo extends Figura{
    
    private double area;
    public Rectangulo(double ancho, double alto) {
        super(ancho, alto);
    }

    public double getAncho()
    {
        return super.getAncho();
    }
    public double getAlto()
    {
        return super.getAlto();
    }
      
    public double getArea() 
    {
        this.area=getAlto()*getAncho();
        return area;
    }
    
}
