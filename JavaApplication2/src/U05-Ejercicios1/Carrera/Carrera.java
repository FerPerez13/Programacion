// Ejercicio 2. Fernando Pérez Andrés

package Practica5;

class Carrera {
    private String nombre;
    private int codigo;
    private String curso;
    
    public Carrera(){
        nombre="Matemáticas";
        codigo=1017;
        curso="Curso 1";
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCurso(String curso){
        this.curso=curso;
    }
    public String getCurso(){
        return this.curso;
    }
    
    public void imprimeAsignatura(String nombre, int codigo, String curso){
        System.out.println("-------------------------------------");
        System.out.println("Asignatura:"+nombre);
        System.out.println("Código:"+codigo);
        System.out.println("Curso:"+curso);
        System.out.println("-------------------------------------");
    }
    
    
    
    
}
