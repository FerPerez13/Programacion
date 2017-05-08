
package Alumnos;

import java.io.*;
import java.util.*;

public class ExeAlumnos {
    
    private static ArrayList<Alumno> alumnos=null;

    public void OrdenarPorApellido(){

        
    }
    
    public void OrdenarPorNota(){
        
    }
    
    public void OrdenarMenosMas(){
        
    }
    
    
    public static int menu(){
        Scanner tcl = new Scanner(System.in);
        System.out.println("x+x+x+x+x+x+x+x+x+x+x+x+xx+x+x");
        System.out.println("x+x+x+x+x IES Serpis x+x+x+x+x");
        System.out.println("x+x+x+x+x+x+x+x+x+x+x+x+xx+x+x");
        System.out.println("");
        System.out.println("1. Introducir datos");
        System.out.println("2. Buscar (por Nombre)");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Guardar aprobados");
        System.out.println("6. Visualizar aprobados");
        System.out.println("7. Guardar alumnos");
        System.out.println("8. Salir");
        System.out.println("");
        System.out.print("Seleccione una opción: ");
        int sel = tcl.nextInt();
        tcl.nextLine();
        System.out.println("");
        System.out.println("x+x+x+x+x+x+x+x+x+x+x+x+xx+x+x");
        System.out.println("");
        return sel;
    }
    
    
    
    public static void main(String[] args) {
        Scanner tcl =  new Scanner(System.in);
        
        //Cargamos a todos los alumnos  
        ArrayList<Alumno> al = new ArrayList();
        if (Alumno.pasarALista() != null){
            al = Alumno.pasarALista();
        }
        
        int sel = menu();
        while(sel<9){
            switch(sel){
                    case 1: 
                        Alumno.ponerDatos(al);                                
                        sel = menu();
                        break;
                    case 2: 
                        System.out.println("Nombre a buscar:");
                        String nom = tcl.nextLine();

                        for(int i=0; i<al.size(); i++){
                            if(al.get(i).getNombre().equalsIgnoreCase(nom)){
                                System.out.println(al.get(i).getNombre() + " "+al.get(i).getApellidos()+"\n"+al.get(i).getCarnet());                          
                            }
                        }  
                        sel = menu();
                        break;
                    case 3:
                        System.out.println("Carnet a buscar:");
                        String car = tcl.nextLine();
                        for(int i=0; i<al.size(); i++){
                            if(al.get(i).getCarnet().equalsIgnoreCase(car)){
                                System.out.println("x+x+x+x+x+x+x+x+x+x+x+x+xx+x+x");
                                System.out.println("Que quiere modificar:");
                                System.out.println("1) Nombre");
                                System.out.println("2) Apellidos");
                                System.out.println("3) Nota 1");
                                System.out.println("4) Nota 2");
                                System.out.println("5) Nota 3");
                                int s = tcl.nextInt();
                                tcl.nextLine();
                                System.out.println("x+x+x+x+x+x+x+x+x+x+x+x+xx+x+x");
                                switch(s){
                                    case 1: 
                                        System.out.println("Dime nombre nuevo:");
                                        String nomN = tcl.nextLine();
                                        al.get(i).setNombre(nomN);
                                        break;
                                    case 2: 
                                        System.out.println("Dime apellidos nuevos:");
                                        String apN = tcl.nextLine();
                                        al.get(i).setApellidos(apN);
                                        break;
                                    case 3: 
                                        System.out.println("Dime Nota 1 nueva:");
                                        int n1N = tcl.nextInt();
                                        tcl.nextLine();
                                        al.get(i).setNota1(n1N);
                                        break;
                                    case 4:
                                        System.out.println("Dime Nota 2 nueva:");
                                        int n2N = tcl.nextInt();
                                        tcl.nextLine();
                                        al.get(i).setNota1(n2N);
                                        break;
                                    case 5: 
                                        System.out.println("Dime Nota 3 nueva:");
                                        int n3N = tcl.nextInt();
                                        tcl.nextLine();
                                        al.get(i).setNota1(n3N);
                                        break;
                                }
                            }
                        }
                        sel = menu();
                        break;
                    case 4:
                        System.out.println("Carnet a buscar:");
                        car = tcl.nextLine();
                        for(int i=0; i<al.size(); i++){
                            if(al.get(i).getCarnet().equalsIgnoreCase(car)){
                                al.remove(i);
                            }
                        }
                        sel=menu();
                        break;
                    case 5:
                        Alumno.pasarFichero5(al);
                        sel = menu();
                    case 6:
                        Alumno.visualizarFichero5(al);
                        sel = menu();
                        break;
                    case 7:
                        Alumno.llenarArchivo(al);
                        sel = menu();
                        break;
                    case 8:
                        System.out.println("Te recomendamos que guardes tus progresos.");
                        System.out.println("¿Quieres guardar? (1. Si / 2. No)");
                        int se = tcl.nextInt();
                        tcl.nextLine();
                        switch(se){
                            case 1: 
                                System.out.println("¡¡Hasta pronto!!");
                                Alumno.llenarArchivo(al);
                                sel = 9;
                                break;
                            case 2:
                                System.out.println("¡¡Hasta pronto!!");
                                sel = 9;
                                break;
                        }
                        break;
            }
        }
        
    }
    
}
