/*

 */
package RELOJ;

public class EjecutaReloj {

    public static void main(String[] args) {
        Reloj hora1= new Reloj();
        Reloj hora2= new Reloj(5,15,30);
        Reloj hora3=new Reloj(18,24,22);
        hora1.imprimirReloj();
        hora1.setRelojFormato(12,45,22,"AM");
        hora1.imprimirReloj();
       // hora1.imprimirRelojFormato(24);
       // hora1.setRelojFormato(6,45,22,"PM");
    //    hora1.imprimirReloj();
       // hora1.imprimirRelojFormato(24);
        //hora2.imprimirRelojFormato(12);
        //hora2.imprimirRelojFormato(24);
        //hora3.imprimirRelojFormato(24);
    
    }
}

