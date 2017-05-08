
package Herencia1;

public class ListaMultimedia {
    
    private Multimedia[] listaMult;
    private int total = 0;
    
    public ListaMultimedia(int max){
        listaMult = new Multimedia[max];
    }
    
    public int size(){
        return total;
    }
    
    public boolean add(Multimedia m){
        if(total < listaMult.length){
            listaMult[total]=m;
            total++;
            return true;            
        }else{
            return false;
        }
    }
    
    // d)
    
}
