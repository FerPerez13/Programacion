//Ejercicio 6. Fernando Perez Andres

import java.util.Scanner;

public class Monedas {
    public static void main (String args[]){
        Scanner tcl = new Scanner(System.in);
        double dinero;
        System.out.println("¿Que cantidad de euros quieres devolver?");
        dinero=tcl.nextDouble();
        
        dinero=dinero*100; //Ahora tenemos el dinero en centimos
        
        int DosE=0, UnE=0, Cinc=0, Vein=0, Diez=0, Cinco=0, Dos=0, Un=0;
            if (dinero>0){
               DosE=(int)dinero/200;
               dinero=dinero-(DosE*200);
               UnE=(int)dinero/100;
               dinero=dinero-(UnE*100);
               Cinc=(int)dinero/50;
               dinero=dinero-(Cinc*50);
               Vein=(int)dinero/20;
               dinero=dinero-(Vein*20);
               Diez=(int)dinero/10;
               dinero=dinero-(Diez*10);
               Cinco=(int)dinero/5;
               dinero=dinero-(Cinco*5);
               Dos=(int)dinero/2;
               dinero=dinero-(Dos*2);
               Un=(int)dinero;
            }
            System.out.println("Hay que dar:");
            System.out.println(DosE+" monedas de 2€");
            System.out.println(UnE+" monedas de 1€");
            System.out.println(Cinc+" monedas de 50cnt");
            System.out.println(Vein+" monedas de 20cnt");
            System.out.println(Diez+" monedas de 10cnt");
            System.out.println(Cinco+" monedas de 5cnt");
            System.out.println(Dos+" monedas de 2cnt");
            System.out.println(Un+" monedas de 1cnt");
    }
}
