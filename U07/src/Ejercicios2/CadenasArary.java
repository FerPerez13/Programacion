//Ejercicio 5. Fernando Pérez Andrés

package Ejercicios2;


public class CadenasArary {
    public static void mostrarCadenasArray(String[] cad){
        System.out.print("[");
        for (int i=0; i<cad.length; i++){
            try{
            System.out.print(cad[i].charAt(0));
            }catch(NullPointerException e){
                System.out.print(" ");
            }
            if(i<cad.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args){
        String[] cad = {"Hola", null, "Estas", "Me", "Llamo", "Fernando"};
        mostrarCadenasArray(cad);
    }
}