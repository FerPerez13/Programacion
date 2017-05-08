//Ejercicio 4: Fernando Pérez Andrés

package Examen;

public class Libro {
    private String titulo;
    private String autor;
    private int numejem;
    private int numprest;
    
    //Constructor vacio
    public Libro(){
        titulo="None";
        autor ="None";
        numejem=0;
        numprest=0;
    }
    
    // Constructor con parametros
    public Libro(String titulo, String autor, int numejem, int numprest){
        this.titulo=titulo;
        this.autor=autor;
        this.numejem=numejem;
        this.numprest=numprest;
    } 
    
    //Setters y Getters
    public void setTitulo(String titulo){
        this.titulo= titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setAutor(String autor){
        this.autor= autor;
    }
    public String getAutor(){
        return this.autor;
    }
    
    public void setNumeroEjemplares(int numejem){
        this.numejem= numejem;
    }
    public int getNumeroEjemplares(){
        return this.numejem;
    }

    public void setNumeroPrestados(int numprest){
        this.numprest= numprest;
    }
    public int getNumeroPrestados(){
        return this.numprest;
    }
    
    //Método prestamo
    public boolean prestamo(){
        if(numejem == 0){
            System.out.println("Lo siento no se puede prestar el libro.");
            return false; 
        }else{
            numejem--;
            numprest++;
            System.out.println("El prestamo se ha efectuado con exito.");
            return true;
        } 
    }
    
    //Método devolución
    public boolean devolucion(){
        if(numprest==0){
            System.out.println("Lo siento, no hemos prestado ningún libro con este título");
            return false;
        }else{
            numprest--;
            numejem++;
            System.out.println("Gracias, la devolución se ha efectuado con éxito. Espero que haya disfrutado del libro.");
            return true;
        }
    }
    
    //Método escribir
    public void escribir(){
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Número de ejemplares disponibles: "+numejem);
        System.out.println("Número de ejemplares prestados: "+numprest);
    }
   
   
    
    
    
}
