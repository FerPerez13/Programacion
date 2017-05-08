//Ejercicio 10b. Fernando Pérez Andrés

import java.util.Random;

public class Moneda {
    public static void main(String args[]){
        Random rnd = new Random();
        int moneda; 
        int conCara=0,conCruz=0;
        for(int i=1;i<1000001;i++){
            moneda=rnd.nextInt(2); // 0=Cara 1=Cruz
            
            if(moneda==0){
                conCara++;
            }
            if(moneda==1){
                conCruz++;
            }
        }
        double porCara, porCruz;
        porCara=conCara/10000;
        porCruz=conCruz/10000;
        System.out.println("Ha salido cara un "+porCara+"% de veces.");
        System.out.println("Ha salido cruz un "+porCruz+"% de veces.");
    }
}
