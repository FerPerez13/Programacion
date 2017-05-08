//Ejercicio 9a. Fernando Pérez Andrés

import java.util.*;

public class FechaValida {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
       
        int dia,mes,año;
        System.out.println("Dime un dia: ");
        dia=tcl.nextInt();
        System.out.println("Dime un mes: ");
        mes=tcl.nextInt();
        System.out.println("Dime un año: ");
        año=tcl.nextInt();
        
        boolean fecha;
        switch(mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
                fecha=(dia>0 && dia<=31) ? true:false;
                if(fecha==true){
                    System.out.println("La fecha: "+dia+"/"+mes+"/"+año+" es correcta.");
                }else{
                    System.out.println("La fecha: "+dia+"/"+mes+"/"+año+" no es correcta.");
                }
            }
            case 4: case 6: case 9: case 11:{
                fecha=(dia>0 && dia<=30)?true:false;
                if(fecha==true){
                    System.out.println("La fecha: "+dia+"/"+mes+"/"+año+" es correcta.");
                }else{
                    System.out.println("La fecha: "+dia+"/"+mes+"/"+año+" no es correcta.");
                }
            }
            case 2:{
                boolean bisiesto;
                bisiesto = año%4==0 && (año%100!=0 || año%400==0);
                if (bisiesto == true){
                    fecha=(dia>0 && dia<=29) ? true:false;
                }else{
                    fecha=(dia>0 && dia<=28) ? true:false;                    
                }
                if(fecha==true){
                    System.out.println("La fecha: "+dia+"/"+mes+"/"+año+" es correcta.");
                }else{
                    System.out.println("La fecha: "+dia+"/"+mes+"/"+año+" no es correcta.");
                }
            }
       }
       
    }

}
