//Ejercicio 4. Fernando Pérez Andrés

package Practica5;

import java.util.Scanner;

public class Reloj {
    
    private int segundo,minuto,hora;
    
    public Reloj(){
        segundo=0;
        minuto=0;
        hora=0;
    }
    public Reloj(int segundo, int minuto, int hora){
        if(segundo<100 && minuto<60 && hora<24){
            this.segundo=segundo;
            this.minuto=minuto;
            this.hora=hora;
        }else{
            System.out.println("Error, formato no valido!");
        }
    }
    
    public void DimeHora(){
        System.out.println(this.hora+":"+this.minuto+":"+this.segundo);
    }
   
    public int DiHora(){
        Scanner tcl=new Scanner(System.in);
        System.out.println("¿Cómo quieres que te muestre la hora?");
        System.out.println("1. Formato 24h");
        System.out.println("2. Formato AM/PM");
        int elec=tcl.nextInt();
        tcl.nextLine();
        switch(elec){
            case 1: 
                System.out.println(this.hora+":"+this.minuto+":"+this.segundo);
                return 0;
            case 2:{ 
                if(hora>12 && hora<24){
                    this.hora=hora-12;
                    System.out.println(this.hora+":"+this.minuto+":"+this.segundo+" PM");
                    return 0;
                }else{
                    System.out.println(this.hora+":"+this.minuto+":"+this.segundo+" AM");
                    return 0;
                }  
            }
            default: System.out.println("No me sirve!"); 
            return 0;    
        }
    }
    
    public void CambiaHora(int hora, int minuto){
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=0;
    }
    public void CambiaHora(int hora, int minuto, int segundo){
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
    }
    
    public void CambiaHora(int hora, int minuto, int segundo, String M){
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
        System.out.println(this.hora+":"+this.minuto+":"+this.segundo+M);
    }  

}
