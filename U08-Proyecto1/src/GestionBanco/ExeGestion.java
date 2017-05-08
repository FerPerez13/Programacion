/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBanco;

import GestionBanco.Cuentas;
import java.util.*;
import java.lang.*;


public class ExeGestion {
    
    private static class OpcionIncorrectaException extends Exception{
        public OpcionIncorrectaException(){}
        public OpcionIncorrectaException(int num){
            System.out.println("ERROR: "+num+" no es una opción válida.");
        }
    }
    
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        Cuentas cuenta = new Cuentas();
        int sel = -1;
        int conCuentas = 0;
        try{           
            sel = cuenta.menu();
            if(sel > 5){
                throw new OpcionIncorrectaException(sel);
            }
        }catch(OpcionIncorrectaException e){
            e.getMessage();
        }
        while(sel != 0){
            if(sel != 1 && conCuentas == 0){
                System.out.println("Actualmente tenemos "+conCuentas+" cuentas en nuestra base de datos.");
                System.out.println("¿Desea crear una nueva cuenta? (1. Si / 2. No)");
                int sel2 = tcl.nextInt();
                switch(sel2){
                    case 1:
                        sel = 1;
                        break;
                    case 2:
                        sel = 0;
                        break;
                }
            }
            
            
                switch(sel){
                    case 1:
                        cuenta.NuevaCuenta(); //Corregido y funcionando 
                        conCuentas++;
                        break;
                    case 2:
                        cuenta.ConsultarCuenta();  //Corregido y funcionando
                        break;
                    case 3:
                        cuenta.ModificarCuenta();  // Corregido y funcionando
                        break;
                    case 4: 
                        cuenta.AnularCuenta();  // Corregido y funcionando
                        conCuentas--;
                        break;
                    case 5:
                        cuenta.visualizarCuentas();  // Corregido y funcionando 
                        break;
                }
            try{           
                sel = cuenta.menu();
                if(sel > 5){
                    throw new OpcionIncorrectaException(sel);
                }
            }catch(OpcionIncorrectaException e){
                e.getMessage();
            }
        }if(sel==0){
            System.out.println("Gracias por su visita.");
        }
    }
    
}
