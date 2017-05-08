//Ejercicio 6b. Fernando Pérez Andrés
public class TablaMult {
    public static void main(String args[]){
        for(int i=1; i<11;i++){
            System.out.println("Tabla del "+i+":");
            for(int j=1; j<11;j++){
                int mult;
                mult=i*j;
                System.out.println(i+" x "+j+" = "+mult);
            }
            System.out.println("--------------");
        }
    }
}
