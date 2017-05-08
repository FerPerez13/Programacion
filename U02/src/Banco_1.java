// Ejercicio 8. Fernando Pérez Andrés

import java.util.Scanner;

public class Banco_1 {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        double importeCuenta;
        double taeAnual;
        double taeMensual;
        double retencion=18;
        double total;
        int meses;
        
        System.out.println("¿Cuanto dinero tienes en la cuenta?");
        importeCuenta=tcl.nextDouble();
        
        System.out.println("¿Cuanto tiempo en meses tienes este importe?");
        meses=tcl.nextInt(); 
        
        System.out.println("¿Cuanto es el porcentaje del incremento a plazo fijo anual?");
        taeAnual=tcl.nextDouble();
        
        System.out.println("Calculando tu incremento mensual");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        
        taeMensual=taeAnual/12;
        
        System.out.println("Tu incremento mensual es de: " + taeMensual + "%");
        
        System.out.println("Calculando cuanto te abonará el banco");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        
        total=((importeCuenta*taeMensual*meses)/100)*retencion/100; //No se seguro si es esta formula
        
        System.out.println("El banco te abonará: " + total + "€"); 
    }
}
