//Ejercicio 7b. Fernando Pérez Andrés

import java.util.*;

public class Potencia {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        double A; 
        int B; 
        System.out.println("Dime el valor de la base: ");
        A=tcl.nextDouble();
        System.out.println("Ahora dime el exponente: ");
        B=tcl.nextInt();
        
        if(A==0 && B==0){
            System.out.println("ERROR: Indeterminación.");
        }else if(B>0){
            double res=1;
            for(int i=1; i<B+1; i++){
                res=res*A;
            }
            System.out.println("El resultado de "+A+" elevado a "+B+" es igual a: "+res);
        }else if(B<0){
            double res=1;
            for(int i=1;i<-B;i++){
                res=res*A;
            }
            res=1/res;
            System.out.println("El resultado de "+A+" elevado a "+B+" es igual a: "+res);
        }else{
            double res=1;
            System.out.println("El resultado de "+A+" elevado a "+B+" es igual a: "+res);
        }
    }
}
