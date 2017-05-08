//Ejercicio 8. Fernando Pérez Andrés

package Ejercicios2;

import java.util.*;

public class Entrenamiento {
    public static void main(String[] args){
        Corredor pepe = new Corredor(50);
        for(int i=0; i<5; i++){
            pepe.correr();
        }
        
        pepe.recargarEnergia(30);
        
        for(int i=0; i<3; i++){
            pepe.correr();
        }
        
        pepe.recargarEnergia(10);
        
        pepe.correr();
        
        System.out.println("----Fin del entrenamiento----");
    }
}
