
package Revision2;

import java.math.*;

public class Punto{
    
    private int x;
    private int y;
    
    public Punto(){
        this.x=0;
        this.y=0;               
    }
    
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
    
    public double distancia(Punto p){ 
        /*Devuelve la distancia desde el punto otro punto*/
        double dist= 0;
        double distX = 0;
        double distY = 0;
        distX = p.getX()-this.x;
        distY = p.getY()-this.y;
        dist = Math.pow(distX, 2)+Math.pow(distY,2);
        dist = Math.sqrt(dist);
        return dist;        
    }
    
    @Override
    public String toString(){
        String str;
        str="("+this.x+","+this.y+")";
        return str;
    }
}

