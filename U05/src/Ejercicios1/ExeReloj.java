
package Practica5;

public class ExeReloj {
   public static void main(String args[]){
       Reloj reloj=new Reloj();
       Reloj reloj2=new Reloj(51,30,15);
       
       reloj.DimeHora();
       System.out.println("--------------------------");
       
       reloj.DiHora();
       System.out.println("--------------------------");
       
       reloj2.DiHora();
       System.out.println("--------------------------");
       
       reloj.CambiaHora(12, 35);
       reloj.DiHora();
       System.out.println("--------------------------");
       
       reloj.CambiaHora(22,15,16);
       reloj.DiHora();
       System.out.println("--------------------------");
       
       reloj.CambiaHora(11, 25, 68, "PM");
       System.out.println("--------------------------");
              
   }
}
