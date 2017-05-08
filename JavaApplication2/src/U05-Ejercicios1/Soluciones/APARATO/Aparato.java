package APARATO;

public class Aparato{
   
    private static int consumoTotal;
    private int  potencia;
    private boolean on;

    public Aparato(int a) {
        on=false;
        potencia = a;
    }

    public void setEncendido() {
        on=true;
        consumoTotal += potencia;
    }

    public void setApagado() {
        on=false;
        consumoTotal -= potencia;
    }

    public static void imprimeConsumoTotal() {
        System.out.println("CONSUMO TOTAL: " + consumoTotal + " W");
    }
}
