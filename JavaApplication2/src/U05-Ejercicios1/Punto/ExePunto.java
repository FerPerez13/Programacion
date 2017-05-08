//2ª perte Ejercicio 3. Fernando Pérez andres
package Practica5;

import java.util.Scanner;

public class ExePunto {
    public static void main(String args[]){
        Scanner tcl=new Scanner(System.in);
        
        Punto p1= new Punto(); 
        System.out.println("Punto1 = ("+p1.getX()+","+p1.getY()+")");
        
        Punto p2= new Punto();
        p2.setX(5);
        p2.setY(3);
        System.out.println("Punto2 = ("+p2.getX()+","+p2.getY()+")");
        
        Punto p3= new Punto();
        p3.setX(2); 
        p3.setY(-1);
        System.out.println("Punto3 = ("+p3.getX()+","+p3.getY()+")");
       
        Punto p4= new Punto();
        p4.setX((p2.getX()+p3.getX())/2);
        p4.setY((p2.getY()+p3.getY())/2);
        System.out.println("Punto4 = ("+p4.getX()+","+p4.getY()+")");
        
        System.out.println("Distancia entre Punto2 y Punto3: "+p1.DistanciaPuntos(p2.getX(),p2.getY(),p3.getX(),p3.getY()));
    
        
        Punto p5=new Punto();
        p5.setX(4);
        p5.setY(3);
        System.out.println("Punto5 = ("+p5.getX()+","+p5.getY()+")");
        
        System.out.println("Distancia Punto5 hasta origen: "+p5.DistanciaPuntos(p5.getX(),p5.getY(),0,0));
        
        System.out.println("Distancia desde Punto5 hasta origen:"+p5.Distancia(p5.getX(),p5.getY()));
    }
    
}
