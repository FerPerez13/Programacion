
package Revision2;

public class ExePoligono {
    
    public static void main(String args[]){
        
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(2,0);        
        Punto p3 = new Punto(2,2);
        Punto p4 = new Punto(0,2);
        
        Punto[] poli = {p1,p2,p3,p4};
        
        Poligono pol = new Poligono(poli);
        System.out.println("=== INFORMACIÓN POLÍGONO ===");
        System.out.println(pol.toString());
        System.out.println("=== PERÍMETRO ===");
        System.out.println(pol.perimetro()+ "\n");
        
        pol.trasladar(4, -3);
        
        System.out.println("=== INFORMACIÓN POLÍGONO ===");
        System.out.println(pol.toString());
        System.out.println("=== PERÍMETRO ===");
        System.out.println(pol.perimetro()+"\n");        
    }
    
}
