// Ccuenta GestionBanco. Fernando Perez Andrés
package GestionBanco;

import java.util.*;

public class Ccuenta {
    
    String nombre;
    String cuenta;
    double saldo;
    double interes; 

    public Ccuenta(){
        nombre = null;
        cuenta = null;
        saldo = 0;
        interes = 0;
    }
    public Ccuenta(String nombre, String cuenta, double saldo, double interes) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.interes = interes;
    }
    //Setters
    public void setNombre(String nom){
        if(nom!=null){
            nombre = nom;
        }
    }    
    public void setCuenta(String cuen){
        if(cuen!=null){
            cuenta = cuen;
        }
    }
    public void setSaldo(double sal){
        if(sal>0){
            saldo=sal;
        }
    }    
    public void setInteres(double inte){
        if(inte>=0){
            interes = inte;
        }
    }
    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getCuenta() {
        return cuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getInteres() {
        return interes;
    }
    
    public void reintegro(double cantidad){
        if(cantidad<=saldo){
            saldo = saldo - cantidad;
        }
    }
    
    public void ingreso(double cantidad){
        this.saldo = this.saldo + cantidad;
    }
    
}
