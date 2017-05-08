// Ejercicio 19. Fernando Pérez Andrés

import java.util.Scanner;

public class ConsumoCoche {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);  // Declaramos que queremos usar el lector por teclado
        double precio1;
        double pagado1;
        double km1;
        System.out.println("¿A cuanto estaba el precio del combustible la primera vez?");
        precio1 = tcl.nextDouble();
        System.out.println("¿Cuanto pagaste por llenar el deposito?");
        pagado1 = tcl.nextDouble();
        System.out.println("¿Cuanto te marcaba el cuenta kilometros la primera vez?");
        km1 = tcl.nextFloat();
        
        double precio2;
        double pagado2;
        System.out.println("¿A cuanto estaba el precio del combustible la segunda vez?");
        precio2 = tcl.nextDouble();
        System.out.println("¿Cuanto pagaste por llenar el deposito?");
        pagado2 = tcl.nextDouble();
        
        double km2;
        System.out.println("¿Cuanto marca el cuenta kilometros ahora?");
        km2 = tcl.nextDouble();

        // Calculamos los litros
        double litro1, litro2, litrotot;                
        litro1=pagado1/precio1;
        litro2=pagado2/precio2; 
        litrotot=litro1+litro2;
        
        // Calculamos el total de Kilometros recorridos
        double kmtot; 
        kmtot=km1+km2;
        
        // Sacamos el consumo cada 100KM
        double cons1;
        cons1=litrotot/kmtot;
        cons1=cons1*100; // Consumo a los 100km
        
        // Pagado por kilometro
        double costexkm;
        costexkm=(pagado1+pagado2)/kmtot;
        
        //Sacamos por pantalla los resultados
        System.out.println("El consumo de combustible por cada 100km es de: "+ cons1+" Litros a los 100");
        System.out.println("El coste por kilometro es de: " + costexkm + " €/km");
 
    }
}
