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
public class AreaFiguras {
    
    private int a,b;
    private double r,h;

    public AreaFiguras(int a, int b, double r, double h) {
        this.a = a; // Lado del cuadrado
        this.b = b; // Base
        this.r = r; // radio
        this.h = h; // altura
    }
    
    
    public int cuadrado(){
        
        return (a*a);
    }
    
    public double rectangulo(){
        return b*h;
    }
    
    public double triangulo(){
        return (b*h)/2;
    }
    
    public double circulo(){
        return Math.PI*(Math.pow(r, 2));
        // Math.PI*(r*r);
    }
    
    
    
}
