// Ejercicio 20. Fernando Pérez Andrés
import java.util.Scanner;

public class BancoSantander {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);  // Declaramos que queremos usar el lector por teclado
        
        double cant;
        double inte;
        int tiempo;
        double retencion=0.18;
    
        // Pedimos al usuario los datos necesarios
        System.out.println("¿Cuanto quieres invertir?");
        cant=tcl.nextDouble();
        System.out.println("¿Que tipo de interés anual tiene tu banco?");
        inte=tcl.nextDouble();
        System.out.println("¿Cuanto tiempo (en meses) vas a mantener la inversión?");
        tiempo=tcl.nextInt();
        
        inte=inte/12; //Hemos pasado el interés anual a un interés mensual
        
        // Calculamos el resultado
        double total;
        total=cant+((cant*inte*tiempo)/100)*retencion;
        System.out.println("Después de "+tiempo+" meses, la inversión, contando la retención del 18%, resultaría de "+total+"€");
    }   
}
