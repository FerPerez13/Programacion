// Archivador de Fichas de Gestion de Pacientes
package GestionPacientes;

import java.util.*;

public class Archivador {
    private ArrayList<Ficha> pacientes = new ArrayList();
    
    public void guardar (Ficha param){
        pacientes.add(param);
    }
    
    public void eliminar (Ficha param){
        pacientes.remove(param);
    }
    
    public void listar(){
        System.out.println("Numero de fichas: "+pacientes.size());
        
        for(int i=0; i<pacientes.size(); i++){
            System.out.println(pacientes.get(i).toString());
        }
    }
}
