
package Ejercicios4;

import java.util.Arrays;

public class APIManejoArrays1 {
    public static void main(String args[]){
        //a
        System.out.println("a)");
        int[] arrInt1 =new int[30];
        for(int i=0; i<10;i++){
            arrInt1[i]=0;
        }
        for(int i=10;i<20;i++){
            arrInt1[i]=1;
        }
        for(int i=20; i<30;i++){
            arrInt1[i]=0;
        }
        System.out.println(Arrays.toString(arrInt1));
        
        //b
        System.out.println("b)");
        char[] arrChar = new char[6];
        for(int i=0; i<arrChar.length/2; i++){
            arrChar[i]='a';
        }
        for(int i=arrChar.length/2;i<arrChar.length;i++){
            arrChar[i]='b';
        }
        System.out.println(Arrays.toString(arrChar));
            
        //c
        System.out.println("c)Creación arrInt2");
        int[] arrInt2 = new int[10];
        for(int i=0;i<arrInt2.length; i++){
            arrInt2[i]=9-i;
        }
        System.out.println(Arrays.toString(arrInt2));
        
        System.out.println("c)Reordenar arrInt2");
        Arrays.sort(arrInt2);
        System.out.println(Arrays.toString(arrInt2));
    }
}
