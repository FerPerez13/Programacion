// Ejercicio 18. Fernando Pérez Andrés

import static java.lang.Math.sqrt;
import java.util.*;

public class TrianguloEq {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        double lado;
        double perim;
        double area;
        double altura;
        System.out.println("¿Cuanto mide el lado del triangulo?");
        lado=tcl.nextDouble();
        perim=lado*3;
        System.out.println("El perimetro suma: "+perim);
        altura=(sqrt(3)*lado)/2;
        area=(lado*altura)/2;
        System.out.println("El area del triangulo es: "+area);
    }
}
