// Ejercicio 12b. Fernando Pérez Andrés

import java.util.*;

public class Dado {
    public static void main(String args[]){
        Random rnd = new Random();
        int dado;
        int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0; //Contadores de las caras del dado
        
        for(int i=1; i<1000001;i++){
            dado=rnd.nextInt(6);
            dado=dado+1; // Con el random vamos del 0 al 5 y necesitamos del 1 al 6
            if(dado==1){ c1++; }
            if(dado==2){ c2++; }
            if(dado==3){ c3++; }  // Contamos cada vez que sale un número
            if(dado==4){ c4++; }
            if(dado==5){ c5++; }
            if(dado==6){ c6++; }
        }
        
        double p1,p2,p3,p4,p5,p6; //porcentaje de aparición
            p1=c1/10000;
            p2=c2/10000;
            p3=c3/10000;
            p4=c4/10000;
            p5=c5/10000;
            p6=c6/10000;
            
            System.out.println("El número 1 ha salido "+c1+" veces y su porcentaje de aparición es: "+p1+"%.");
            System.out.println("El número 2 ha salido "+c2+" veces y su porcentaje de aparición es: "+p2+"%.");
            System.out.println("El número 3 ha salido "+c3+" veces y su porcentaje de aparición es: "+p3+"%.");
            System.out.println("El número 4 ha salido "+c4+" veces y su porcentaje de aparición es: "+p4+"%.");
            System.out.println("El número 5 ha salido "+c5+" veces y su porcentaje de aparición es: "+p5+"%.");
            System.out.println("El número 6 ha salido "+c6+" veces y su porcentaje de aparición es: "+p6+"%.");
    }
}
