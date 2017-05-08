// Ejercicio 6. Fernando Perez Andres
import java.util.Scanner;
public class ComprarDeportivas {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        double precio;
        int descuento=15;
        double precioTotal;
        
        System.out.println("¿Cuanto cuesta el articulo?: ");;
        precio=tcl.nextDouble();
        precioTotal=precio-((precio*15)/100);
        System.out.println("Aplicando un descuento del 15% el precio se queda en: " + precioTotal + "€");
    }
}
