//Ejercicio 11. Fernando Pérez Andrés
import java.util.*;

public class DefNum {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in); 
        int alto;
        int ancho; 
        System.out.println("Dime la altura del rectangulo");
        alto=tcl.nextInt();
        System.out.println("Dime el ancho del rectangulo");
        ancho=tcl.nextInt();
        
        System.out.println("Ahora procederemos a calcular el perimetro y el area del rectangulo: ");
        
        int area;
        area = alto*ancho;
        System.out.println("El area del rectangulo es de: "+ area);
        int perimetro;
        perimetro=2*alto + 2*ancho;
        System.out.println("El aperimetro del rectangulo es de: "+ perimetro);
    }
}
