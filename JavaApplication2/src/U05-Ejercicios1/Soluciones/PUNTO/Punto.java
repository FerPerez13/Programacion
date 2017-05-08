/*
 3. Clase PUNTO
a) Definir una clase que represente un punto en un espacio bidimensional. 
* La clase debe disponer de un constructor con las coordenadas del punto y métodos accesores a las coordenadas
b) Escribe un programa que instancie cuatro puntos: 
* el primero situado en el origen, el segundo situado en (5,3), el tercero en (2, -1) 
* y el cuarto estará situado en el punto medio entre el segundo y el tercero.
c) Añade a la clase Punto un constructor sin parámetros, que permita construir puntos en el origen de coordenadas
d) Añade un método a la clase Punto que calcule la distancia a otro punto
e) Escribir un programa que cree un punto en (4,3) y visualice la distancia del punto al origen de coordenadas
f) Escribe la clase Punto con dos métodos llamados distancia. 
* Uno de ellos calcula la distancia a otro punto y el otro calcula la distancia al origen
* 
* Añade a la clase Punto una constante llamada ORIGEN que sea el origen de coordenadas. 
* La constante debe ser accesible de forma estática. 
* Escribe un programa, de nombre PruebaPunto, que determine la distancia de los puntos (3,4), (0,4) y (2,-1) 
* al origen usando la constante ORIGEN.
 */

package PUNTO;

public class Punto {
        
    private int x, y;
    private final static int origenX=0,origenY=0;
    
    public Punto(int a, int b) {
        x = a;
        y = b;
    }

    public Punto(int a){// Método que con un parámetro pone los dos iguales.
        x=a;
        y=a;
    }
    
    public Punto() {//Ejercicio 6: Constructor sin parámetros, permite construir puntos en el origen
        x = origenX;
        y = origenY;
    }

    public void setCoordenadaX(int a) {
        x = a;
    }

    public void setCoordenadaY(int b) {
        y = b;
    }

    public int getCoordenadaX() {
        return x;
    }

    public int getCoordenadaY() {
        return y;
    }
  
    public void mostrarPunto(){
        System.out.print(" ( " + this.x + " , " + this.y + " ) ");
    }
     public String darPunto(){
         return  " ( " + this.x + " , " + this.y + " ) ";
    }
    public double distancia(Punto otro) { //Ejercicio 7 Método calcular distancia a otro punto
        double distancia = Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
        return distancia;
    }

    public double distancia() {// Ejercicio 9 Método que calcula distancia entre punto y origen EJERCICIO 9
        Punto origen=new Punto();
        return distancia (origen);
    }

    public void imprimirCuadrante() {
        if (x > 0 && y > 0) {
            System.out.println("1º Cuadrante");// x positiva, y positiva 1cuadrante 
        }
        else if (x < 0 && y > 0) {
            System.out.println("2º Cuadrante");//x negativa, y positiva 2cuadrante
        }
        else if (x < 0 && y < 0) {
            System.out.println("3º Cuadrante");//x negativa, y negativa 3 cuadrante
        }
        else if (x > 0 && y < 0) {
            System.out.println("4º Cuadrante");//x positiva, y negativa 4 cuadrante
        }
        else if (x==0 && y==0){
            System.out.println("Origen de Coordenadas");// (0,0)
        }
        else if (x==0 && y!=0){
            System.out.println("Eje Y");// (0,Y)
        }
        else if (x!=0 && y==0){
            System.out.println("Eje X");// (X,0)
        }
    }
    
    //Representa gráficamente los puntos del primer cuadrante 
    public void puntoGrafico() {
        for (int j = this.y + 3; j >= 1; j--) {
            System.out.print("\n " + j + " ");
            for (int i = 1; i <= this.x + 2; i++) {
                if (this.x == i && this.y == j) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" · ");
                }
            }
        }
        //Representar x = abcisas
        System.out.print("\n   ");
        for (int i = 1; i <= this.x + 2; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }
    
    
}
