
package Revision1;

public class Hora {
    private int hora;
    private int min;
    
    public Hora(){
        hora=0;
        min=0;
    }
    public Hora(int h, int m){
        hora=h;
        min=m;
    }

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public String toString(){
        String str = hora+":"+min;
        return str;
    }
    
    
}
