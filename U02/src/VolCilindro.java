// Ejercicio 12. Fernando Pérez Andrés
import java.util.*;
public class VolCilindro {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in); 
        final double pi = 3.1415926536;
        int diametro;
        int altura; 
        double vol,area;
        System.out.println("Vamos a calcular el area del cilindro");
        System.out.println("Primero necesito el diametro del circulo");
        diametro=tcl.nextInt();
        System.out.println("Ahora necesito que me digas cuanto mide la altura del cilindro");
        altura=tcl.nextInt();
        area=2*pi*(diametro/2)*altura;
        System.out.println("Entonces el area del cilindo es de: "+ area);
        vol=pi*(diametro/2)*(diametro/2);
        System.out.println("Y el volumen del cilindo es de: "+ vol);             
    }
}
