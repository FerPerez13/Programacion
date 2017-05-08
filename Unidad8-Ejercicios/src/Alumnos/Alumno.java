package Alumnos;

import java.io.*;
import java.util.*;

public class Alumno  implements Serializable{
    
    private String carnet;
    private String nombre;
    private String apellidos;
    private double nota1, nota2, nota3;

    public Alumno() {
        this.carnet = "";
        this.nombre = "";
        this.apellidos = "";
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }

    public Alumno(String carnet, String nombre, String apellidos, double nota1, double nota2, double nota3) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    //METODOS DEL EXE
    
    public double getNotaMedia(){
        double notaMedia = nota1+nota2+nota3;
        notaMedia=notaMedia/3;
        return notaMedia;
        
    }
    
    public static void ponerDatos(ArrayList<Alumno> ListaAlumnos){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Carnet:");
        String car = tcl.nextLine();
        System.out.println("Nombre");
        String nom = tcl.nextLine();
        System.out.println("Apellidos:");
        String ap = tcl.nextLine();
        System.out.println("Nota 1:");
        double n1 = tcl.nextDouble();
        tcl.nextLine();
        System.out.println("Nota 2:");
        double n2 = tcl.nextDouble();
        tcl.nextLine();
        System.out.println("Nota 3:");
        double n3 = tcl.nextDouble();
        tcl.nextLine();
        Alumno alum = new Alumno(car, nom, ap, n1, n2, n3);
        ListaAlumnos.add(alum);
    }
    
    
    public static void llenarArchivo(ArrayList<Alumno> list){
        try{
            FileOutputStream fil = new FileOutputStream("alumnos.dat");
            BufferedOutputStream bff = new BufferedOutputStream(fil);
            ObjectOutputStream ost = new ObjectOutputStream(bff);            
            ost.writeObject(list);            
            ost.close();
        }catch(IOException e){
            System.err.println("Error al escribir el archivo");
            System.err.println(e.getMessage());
        }
    }
    
    public static ArrayList<Alumno> pasarALista(){
        try{
            FileInputStream file = new FileInputStream("alumnos.dat");
            BufferedInputStream bff = new BufferedInputStream(file);
            ObjectInputStream ist = new ObjectInputStream(bff);
            
            ArrayList<Alumno> a = (ArrayList<Alumno>) ist.readObject();
            ist.close();
            return a;            
        }catch(IOException e){
            System.err.println("El archivo todavía no existe");
            return null;
        }catch(ClassNotFoundException e){
            System.err.println("ERROR: Clase no encontrada");
            return null;
        }
    }
    
    public static void pasarFichero5(ArrayList<Alumno> al){
        
        for(int i=0; i<al.size();i++){
            
            double notaMedia = al.get(i).getNota1()+al.get(i).getNota2()+al.get(i).getNota3();
            notaMedia = notaMedia/3;
            
            
            if(notaMedia > 5 || notaMedia == 5 ){ 
                FileOutputStream fos = null;
                BufferedOutputStream buf = null;
                ObjectOutputStream oos = null;
                try{
                    File fil = new File("alumnos5.dat");
                    fos = new FileOutputStream(fil);
                    buf = new BufferedOutputStream(fos);
                    oos = new ObjectOutputStream(buf);
                    
                    oos.writeObject(al);
                    
                }catch (FileNotFoundException e){
                    System.out.println("ERROR: Fichero no encontrado");
                    System.out.println(e.getMessage());
                }catch ( Exception e){
                    System.out.println("ERROR: Error en la escritura del fichero");
                    System.out.println(e.getMessage());
                }finally{
                    try{
                        if(oos != null){
                            oos.close();
                        }
                    }catch (Exception e){
                        System.out.println("Error al cerrar el fichero");
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
    
    public static void visualizarFichero5(ArrayList<Alumno> alum){
        FileInputStream fis = null;
        BufferedInputStream bif = null;
        ObjectInputStream ois = null;
        try{
            File fil = new File("alumnos5.dat");
            fis = new FileInputStream(fil);
            bif = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bif);

            alum = (ArrayList<Alumno>) ois.readObject();
            
            for(int i=0; i<alum.size();i++){
                double notaMedia = alum.get(i).getNota1()+alum.get(i).getNota2()+alum.get(i).getNota3();
                notaMedia = notaMedia/3;
                System.out.println("***********************");
                System.out.println(alum.get(i).getCarnet());
                System.out.println(notaMedia);
                System.out.println("***********************");
                System.out.println("");
            }
            
        }catch (FileNotFoundException e){
            System.out.println("ERROR: Fichero no encontrado");
            System.out.println(e.getMessage());
        }catch ( Exception e){
            System.out.println("ERROR: Error en la lectura del fichero");
            System.out.println(e.getMessage());
        }finally{
            try{
                if(ois != null){
                    ois.close();
                }
            }catch (Exception e){
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
        
        
    } 
}
