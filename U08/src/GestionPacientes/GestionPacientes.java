//Ejercicio 2. Fernando Pérez Andrés
package GestionPacientes;

import java.util.*;

public class GestionPacientes {
    public static void main(String args[]){
        Archivador a = new Archivador();
        Ficha f = new Ficha("Pepe","Lopez",22);
        
        a.guardar(f);
        a.guardar(new Ficha("Teresa", "Argente",12));
        a.guardar(new Ficha("Eduardo", "Boscá",34));
        a.listar();
        a.eliminar(f);
        a.listar();     
    }
    
}
