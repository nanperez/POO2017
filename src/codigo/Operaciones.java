/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author naperez
 */
public class Operaciones {
    private int a, b;
    private double c;
/*
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double getC() {
        return c;
    }
   */ 
    public int suma(int x, int y){
        this.a = x;
        this.b = y;
        
        return a+b;
    }
    
    public double suma(int x, double y){
        this.a = x;
        this.c = y;
        
        return a+c;
    }
    
    
    
}
