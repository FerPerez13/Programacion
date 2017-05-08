// Ejercicio 3. Fernando Pérez Andrés

package Practica5;

class Punto {
    private double x,y;
    private double nx,ny; //nx=newX ny=newY
    
    public Punto(){
        x=0;
        y=0;
    }
    
    //Get-Set de X
    public void setX(double x){
        this.x=x;
    }
    public double getX(){
        return this.x;
    }
    //Get-Set de Y
    public void setY(double y){
        this.y=y;
    }
    public double getY(){
        return this.y;
    }
    
    public double DistanciaPuntos(double x1,double y1, double x2, double y2){
        double distancia;
        distancia=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
        return distancia;
    }
    public double Distancia(double x, double y){ //Distancia hasta el 0,0
        double distancia;
        distancia=Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
        return distancia;
    }
    public double Distancia(double x1,double y1, double x2, double y2){ //Distancia entre dos puntos
        double distancia;
        distancia=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
        return distancia;
    }
}

