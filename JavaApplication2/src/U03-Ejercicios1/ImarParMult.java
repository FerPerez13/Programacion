//Ejercicio 3b. Fernando Pérez Andres

public class ImarParMult {
    public static void main(String args[]){
        int contPar=0,contImpar=0,contMult=0;
        for (int i=1;i<100;i++){
            if(i%2==0){
                contPar++;
                System.out.println("Con el "+i+" tenemos "+contPar+" números pares.");
            }
            if(i%5==0){
                contMult++;
                System.out.println("Con el "+i+" tenemos "+contMult+" números multiplos de 5.");
            }
            if(i%2!=0){
                contImpar++;
                System.out.println("Con el "+i+" tenemos "+contImpar+" números impares.");
            }
        }
    }
}
