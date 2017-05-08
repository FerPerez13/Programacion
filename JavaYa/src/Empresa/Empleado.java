
//Ejercicios de la web: http://javaya.com.ar/detalleconcepto.php?codigo=102&inicio=20

package Empresa;

import java.util.*;

public class Empleado extends Persona{
    private double sueldo;
    
    public Empleado(){
        this.sueldo = 0;
    }
    
    public void intoSueldo(){
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Ingresa el sueldo:");
        double sueldo = tcl.nextDouble();
        
        this.sueldo = sueldo;
    }
    
    public void imprimeSueldo(){
        System.out.println("Sueldo: "+sueldo+"€");
    }
}
