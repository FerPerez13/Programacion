
package Revision1;

import java.util.*;

public class ExeExamen {
    
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Asignatura:");
        String asig = tcl.nextLine();
        tcl.nextLine();
        
        System.out.println("Aula del examen:");
        String aula = tcl.nextLine();
        tcl.nextLine();
        
        System.out.println("Fecha del examen:");
        System.out.println("Día:");
        int dia = tcl.nextInt();
        tcl.nextLine();
        System.out.println("Mes:");
        String mes = tcl.nextLine();
        tcl.nextLine();
        System.out.println("Año:");
        int año = tcl.nextInt();
        tcl.nextLine();
        
        Fecha fecha = new Fecha(dia,mes,año);        
        
        System.out.println("Hora del examen:");
        System.out.println("Hora:");
        int h = tcl.nextInt();
        tcl.nextLine();
        System.out.println();
        System.out.println("Minutos:");
        int m = tcl.nextInt();
        tcl.nextLine();
        System.out.println();
        Hora hora = new Hora(h,m);
        
        Examen examen = new Examen(asig, aula, fecha, hora);
        
        System.out.println(examen.toString());
        
        System.out.println("*******************************");
        
        System.out.println("Modificamos la fecha y la hora:");
        
        System.out.println("Fecha del examen:");
        System.out.println("Día:");
        int diaN = tcl.nextInt();
        tcl.nextLine();
        System.out.println("Mes:");
        String mesN = tcl.nextLine();
        tcl.nextLine();
        System.out.println("Año:");
        int añoN = tcl.nextInt();
        tcl.nextLine();
        Fecha fechaN = new Fecha(diaN,mesN,añoN);
        examen.setFecha(fechaN);
        
        System.out.println("Hora del examen:");
        System.out.println("Hora:");
        int hN = tcl.nextInt();
        tcl.nextLine();
        System.out.println("Minutos:");
        int mN = tcl.nextInt();
        tcl.nextLine();
        Hora horaN = new Hora(hN,mN);
        examen.setHora(horaN);
        
        System.out.println(examen.toString());
        
        
        
    }
    
}
