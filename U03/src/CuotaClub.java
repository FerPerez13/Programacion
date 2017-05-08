//Ejercicio 7. Fernando Pérez Andr

import java.util.Scanner;

public class CuotaClub {
    public static void main (String args[]){
        Scanner tcl = new Scanner(System.in);
        double cuota=500;
        int edad; 
        boolean PadreSocio;
        
        System.out.println("Cuantos años tiene el socio: ");
        edad=tcl.nextInt();
        if(edad>65){
            cuota=cuota-cuota/2;
            System.out.println("Tiene que pagar "+cuota+"€ por ser mayor de 65 años.");
        }else if(edad<18){
            System.out.println("El abonado es menor de edad. ¿Los padres son socios? (true/false)");
            PadreSocio=tcl.nextBoolean();
            if(PadreSocio==true){
                cuota=cuota-cuota*0.35;
                System.out.println("Tiene que pagar "+cuota+"€ por tener un padre socio.");
            }else{
                cuota=cuota-cuota*0.25;
                System.out.println("Tiene que pagar "+cuota+"€ por no tener un padre socio.");
            }
        }else{
            System.out.println("Tiene que pagar 500€ de cuota.");
        }
    }
}