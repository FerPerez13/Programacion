//Ejercicio 13. Fernando Pérez Andrés

import java.util.Scanner;

public class Banco2 {
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
        
        taeMensual=taeAnual/12;
        
        total=((importeCuenta*taeMensual*meses)/100)*retencion/100; //No se seguro si es esta formula
        
        System.out.println("El banco te abonará: " + total + "€"); 
    }
}
