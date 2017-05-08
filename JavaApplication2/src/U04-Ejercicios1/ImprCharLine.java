
package Practica4;

//Ejercicio 7. Fernando Pérez Andrés

import java.util.Scanner;

public class ImprCharLine {
    
    public static void main(String args[]){
        Scanner tcl=new Scanner(System.in);
        int num1, num2;
        char car;
        System.out.println("Dame un caracter:");
        car=tcl.next().charAt(0);
        System.out.println("¿Cuantos caracteres por linea quieres?");
        num1=tcl.nextInt();
        System.out.println("¿Cuantas líneas quieres?");
        num2=tcl.nextInt();
        
        System.out.println("Ahora observa el resultado:");
        ImprCharLine.impr(car,num1,num2);
        
    }
    
    public static char impr(char car, int nc, int nl){ //nc=numero caracteres; nl=numero lineas
        for (int i=0; i<nl; i++){
            for(int j=0; j<nc; j++){
                System.out.print(car);
            }
            System.out.println("");
        }
        return car;
    }
}
