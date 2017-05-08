// Ejercicio 4 Practica 3. Fernando Pérez Andrés
package Ejercicios2;

import java.util.*;

public class Practica_3 {
    public static void main(String args[]){
        Scanner tcl=new Scanner(System.in);
        
        Garaje garaje = new Garaje();
        
        Coche c1= new Coche();
        System.out.println("Marca del primer Coche:");
        String marca=tcl.next();
        System.out.println("Modelo del "+marca+" :");
        String mod=tcl.next();
        c1.Coche(marca,mod);
  
        Coche c2= new Coche();
        System.out.println("Marca del segundo Coche:");
        marca=tcl.next();
        System.out.println("Modelo del "+marca+" :");
        mod=tcl.next();
        c2.Coche(marca,mod);
        
        // Menú de Usuario
        String averia;
        for(int i=1; i<5;i++){
            switch(i){
                case 1: case 3:
                    System.out.println("¿Que averia tiene su "+c1.getMarca()+"? (Motor, Aceite, Cambio ruedas, Cigüeñal)");
                    averia=tcl.next();
                    garaje.aceptarCoche(c1, averia);
                    garaje.devolverCoche();
                    break;

                case 2: case 4:
                    System.out.println("¿Que averia tiene su "+c2.getMarca()+"? (Motor, Aceite, Cambio ruedas, Cigüeñal)");
                    averia=tcl.next();
                    garaje.aceptarCoche(c2, averia);
                    garaje.devolverCoche();
                    break;
            }
        }
        
        System.out.println("El coche "+c1.getMarca()+" "+c1.getModelo()+" ha gastado "+c1.getPrecioAverias()+"€ en reparaciones.");
        
        System.out.println("El coche "+c2.getMarca()+" "+c2.getModelo()+" ha gastado "+c2.getPrecioAverias()+"€ en reparaciones.");
       
                
        
    }
    
}
