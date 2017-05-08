package Practica5;

//Ejercicio 1. Fernando Pérez Andreś

class Coche{
    
    private String modelo;
    private String color;
    private String matricula;
    private String tipo;
    private String seguro;
    private boolean metalizada;
    private int año;
    
    public Coche(){ //Constructor con todas las variables inicializadas en 0 o none
        modelo="none";
        color="none";
        matricula="none";
        tipo="none";
        seguro="none";
        metalizada=false;
        año=0000;
    }
    
    public void setCoche(String modelo, String color, boolean metalizado, String matricula, String tipo, int año, String seguro){
        this.modelo=modelo;
        this.color=color;
        this.matricula=matricula; //Con esto creamos los coches directamente
        this.tipo=tipo;
        this.seguro=seguro;
        this.metalizada=metalizada;
        this.año=año;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;// this.___ es para seleccionar la variable de la clase 
    }
    public String getModelo(){ // Devuelve el modelo
        return this.modelo; 
    }
    
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color; 
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public String getMatricula(){
        return this.matricula; 
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public String getTipo(){
        return this.tipo; 
    }
    
    public void setSeguro(String seguro){
        this.seguro=seguro;
    }
    public String getSeguro(){
        return this.seguro; 
    }
    
    public void setMetalizada(boolean metalizada){
        this.metalizada=metalizada;
    }
    public boolean getMetalizada(){
        return this.metalizada; 
    }
    
    public void setAño(int año){
        this.año=año;
    }
    public int getAño(){
        return this.año; 
    }
    
    public void imprimeCoche(String modelo, String color){
        System.out.println("Modelo: "+modelo+"; Color: "+color);
    }

}

