
package Revision1;

public class Fecha {
    
    private int dia;
    private String mes;
    private int año;
    
    public Fecha(){
        this.dia=0;
        this.mes="none";
        this.año=0;
    }

    public Fecha(int dia, String mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String toString(){
        String str = dia+" de "+mes+" de "+año;
        return str;
    }
    
    
}
