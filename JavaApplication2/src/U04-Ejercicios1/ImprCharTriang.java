package Practica4;

//Ejercicio 8. Fernando Perez Andres

import java.util.Scanner;

public class ImprCharTriang {
    
    public static void main(String args[]){
        Scanner tcl= new Scanner(System.in);
        int num1;
        char car;
        System.out.println("Dame un caracter:");
        car=tcl.next().charAt(0);
        System.out.println("¿Cuantas líneas quieres?");
        num1=tcl.nextInt();
        
        System.out.println("Ahora observa el resultado:");
        ImprCharTriang.impr(car,num1);
    }
    public static char impr(char car,int nl){
        int ncar=1;                             //numero que se repite el caracter
        int nbn=(2*nl-1)-ncar;                  //numero de caracteres en blanco que habra en la línea
        for(int i=0; i<nl;i++){
            for(int blnc=0;blnc<nbn/2;blnc++){  //blnc<nbn/2 = numero de blanos de la linea dividido 2
                System.out.print(" ");          // Imprimir blancos a la izquierda
            }
            for(int c=0;c<ncar;c++){
                System.out.print(car);          // Imprimir caracteres en la línea
            }
            for(int blnc=0;blnc<nbn/2;blnc++){  //blnc<nbn/2 = numero de blanos de la linea dividido 2
                System.out.print(" ");          // Imprimir blancos derecha
            }
            System.out.println("");             //necesario para el cambio de línea
            ncar=ncar+2;
            nbn=(2*nl-1)-ncar;
        }
        return car;
    }
    
}