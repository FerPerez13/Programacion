package PUNTO;

public class EjecutaPunto {

    public static void main(String[] args) {
        Punto punto1 = new Punto();//Punto origen de coordenads (0,0)
        Punto punto2 = new Punto(5, 3);
        Punto punto3 = new Punto(2, -1);
        //Punto medio M =  ( (x1 + x2) / 2 , (y1 + y2) / 2)
        Punto punto4 = new Punto((punto2.getCoordenadaX() + punto3.getCoordenadaX()) / 2, 
                (punto2.getCoordenadaY() + punto3.getCoordenadaY()) / 2);

        System.out.print("\nPUNTO 1 = " );punto1.mostrarPunto(); // Mostramos puntos
        System.out.print("\nPUNTO 2 = " );punto2.mostrarPunto(); 
        System.out.print("\nPUNTO 3 = " );punto3.mostrarPunto(); 
        System.out.print("\nPUNTO 4 = " );punto4.mostrarPunto(); 
   
        //Distancias
        System.out.println("\nDistancias:");
        Punto punto5 = new Punto(4,3);
        Punto punto6 = new Punto(3, 4);
        Punto punto7 = new Punto(0, 4);
        Punto punto8 = new Punto(2, -1);
        System.out.println("Distancia de "+ punto5.darPunto()+" al origen: "+punto5.distancia());
        System.out.println("Distancia de "+ punto6.darPunto()+" al "+punto5.darPunto()+ " : "+ punto6.distancia(punto5));
        System.out.println("Distancia de "+ punto7.darPunto()+" al origen: "+punto7.distancia());
        System.out.println("Distancia de "+ punto8.darPunto()+" al origen: "+punto8.distancia());
        
        //Representacion gráfica del 1er cuadrante.
        punto6.puntoGrafico();
        punto2.puntoGrafico();
        

    }
}
