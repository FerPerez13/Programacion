//Ejercicio 5b. Fernando Pérez Andrés

public class Del1al100 {
    public static void main(String args[]){
        int contPar=0, contImp=0, contMult4=0, contMult7=0;
        int sumaPar=0, sumaImp=0, sumaMult4=0, sumaMult7=0;
        System.out.println("Los números del 1 al 100 son:");
        for (int i=1;i<101; i++){
            System.out.println(i);
            if(i%2==0){
                contPar++;
                sumaPar=sumaPar+i;
            }
            if(i%2!=0){
                contImp++;
                sumaImp=sumaImp+i;
            }
            if(i%4==0){
                contMult4++;
                sumaMult4=sumaMult4+i;                
            }
            if(i%7==0){
                contMult7++;
                sumaMult7=sumaMult7+i;
            }
        }
        System.out.println("Hay "+contPar+" números pares y su suma es: "+sumaPar);
        System.out.println("Hay "+contImp+" números impares y su suma es: "+sumaImp);
        System.out.println("Hay "+contMult4+" multiplos de 4 y su suma es: "+sumaMult4);
        System.out.println("Hay "+contMult7+" multiplos de 7 y su suma es: "+sumaMult7);
    }
    
}
