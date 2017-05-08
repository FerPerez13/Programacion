// Ejercicio 15. Fernando Pérez Andrés
import java.util.*;

public class DiasSemana {
    public enum DiaSemana{LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
    public static void main(String args[]){
        
        DiaSemana hoy = DiaSemana.MARTES;
        DiaSemana ultimo=DiaSemana.DOMINGO;
        
        System.out.println( "Hoy es " +hoy +". Y el ultimo dia es"+ultimo );
    }
}
