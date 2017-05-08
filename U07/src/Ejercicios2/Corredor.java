// Ejercicio 7. Fernando Pérez Andrés
package Ejercicios2;

public class Corredor {
    private static int energia;
    private static class AgotadoException extends Exception{
        public AgotadoException(String msj){
            super(msj);
        }
    }
    public Corredor(int energia){
        this.energia = energia;
    }
    public void recargarEnergia(int energia){
        this.energia = this.energia + energia;
        System.out.println("El corredor ha descansado y ha recuperado "+energia+" de energia");
        System.out.println("Ahora tiene: "+this.energia+" energia");
    }
    public void correr(){
        try{
            if(this.energia >= 10){
                this.energia = this.energia-10;
                System.out.println("Perfecto. Al corredor le quedan "+energia+" de energia");
            }else{
                throw new AgotadoException("El corredor esta agotado");
            }
        }catch (AgotadoException e){
            e.getMessage();
        }
    }
}
