// Ejercicio 1. Fernando Pérez Andrés
package ListaPaises;

import java.util.*;


public class ListaPaises {
    public static void main(String args[]){
        ArrayList<String> listaPaises = new ArrayList();
        
        //Insertar detras del último
        listaPaises.add("España");
        listaPaises.add("Francia");
        listaPaises.add("Portugal");
        //Orden: Esp, Fra, Por
        
        //Insertar en posición especifica
        listaPaises.add(1,"Italia");
        //Orden ahora: Esp Ita Fra Por
        
        //Mostrar un elemento concreto
        System.out.println(listaPaises.get(3));
        //Mostrará POR
        
        //Modificar elementos
        listaPaises.set(1, "Alemania");
        
        //Buscar un elemento
        String paisBuscado = "Francia";
        int pos = listaPaises.indexOf(paisBuscado);
        if(pos!=1){
            System.out.println(paisBuscado + " esta en la posición: "+pos);
        }else{
            System.out.println(paisBuscado + " no se ha encontrado");
        }
        
        //Recorrer el contenido de la lista con FOR
        for(int i=0; i<listaPaises.size();i++){
            System.out.println(listaPaises.get(i)+" esta en la posición: " + i);
        }
        //Otra forma de sacar el contenido de la lista
        for(String pais:listaPaises){
            System.out.println(pais);
        }
        
        //Recorrer usando Iterator
        Iterator iter = listaPaises.iterator();
        while(iter.hasNext()){      //True si existen ,ás elementos 
            System.out.println(iter.next()); //devuelve elemento y apunta al siguiente
        }
        
    }
    
}
