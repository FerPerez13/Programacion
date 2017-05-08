
package Figuras;

public class ExeFiguras {

    public static void main(String[] args) {
        
        double ancho = 5;
        double alto = 3;
        
        Triangulo tr = new Triangulo(ancho,alto);
        System.out.println("TRIANGULO");
        tr.imprimirDatos();
        System.out.println("Area: "+tr.getArea());
        
        
        Rectangulo rec = new Rectangulo(alto,alto);
        System.out.println("RECTANGULO");
        rec.imprimirDatos();
        System.out.println("Area: "+tr.getArea());
        

    }
}
