package Practica4;

// Eejrcicio 12. Fernando Pérez Andrés

import java.util.Scanner;

public class NomIdioma {
    public static void main (String args[]){
        Scanner tcl=new Scanner(System.in);
        String nombre;
        System.out.println("Hola, ¿Como te llamas?");
        nombre=tcl.nextLine();
        int idioma;
        System.out.println("¿Cual es tu idioma?");
        System.out.println("1 - Valenciano/Valencià/Valencian");
        System.out.println("2 - Castellano/Castellà/Spanish");
        System.out.println("3 - Inglés/Anglés/English");
        idioma=tcl.nextInt();
        
        NomIdioma.saludo(nombre, idioma);
    }
    public static int saludo(String nom, int idioma){
        switch(idioma){
            case 1: 
                System.out.println("Bon dìa "+nom);        
                return 0;
            case 2: 
                System.out.println("Buenos días "+nom);
                return 0;
            case 3: 
                System.out.println("Good morning Ms."+nom);
                return 0;
            default: 
                System.out.println("ERROR: Sr/Sra."+nom+" no ha introducido un idioma correcto, ejecute de nuevo el programa.");
                return 0;
        }
    }
}
