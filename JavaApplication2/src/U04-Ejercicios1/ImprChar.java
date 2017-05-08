package Practica4;

// Ejercicio 6. Fernando Pérez Andrés

import java.util.Scanner;

public class ImprChar {
    public static void main(String args[]){
        Scanner tcl=new Scanner(System.in);
        char caracter;
        int num;
        System.out.println("¿Que caracter quieres imprimir?");
        caracter=tcl.next().charAt(0);
        System.out.println("¿Cuantas veces quieres que lo imprima?");
        num=tcl.nextInt();
        System.out.println("Ahora mira el resultado: ");
        ImprChar.impr(caracter, num); // Ejecutamos el método impr para sacar por pantalla
    }
    public static char impr(char car, int num){
        for (int i=0; i<num; i++){
            System.out.println(car);       
        }
        return car;
    }
}
