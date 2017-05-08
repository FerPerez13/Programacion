
package Ejercicios4;

import java.util.Arrays;

public class APIManejoArrays2 {
    public static void main(String args[]){
        System.out.println("a)");
        String[] arrStr = {"camion", "coche", "jofersar", "Fernando", "Maria"};
        System.out.println(Arrays.toString(arrStr));
        
        System.out.println("b)");
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));
    
        System.out.println("c)");
        Arrays.sort(arrStr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(arrStr));

        //d
        //TODO:
        //e
        //TODO:
    }
}
