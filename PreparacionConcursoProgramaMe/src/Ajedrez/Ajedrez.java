
package Ajedrez;

import java.util.*;

public class Ajedrez {
    public static void main(String[] args) {
        
        Scanner tcl = new Scanner(System.in);
        
        //Pedimos los valores de la entrada
        int n1 = tcl.nextInt();
        int n2 = tcl.nextInt();
        int n3 = tcl.nextInt();
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        
        int total = 0;
        int num = n1;
        
        for(int i=0; i<n3; i++){
            num = num*n2;
            total = total+num;
        }
        System.out.println(total);
    }
}
