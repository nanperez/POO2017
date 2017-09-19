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
public class UsoClase {
    
    public static void main(String args[]){
        
       AreaFiguras obj1,obj2; // Declarando objetos de la clase
       Operaciones s1 = new Operaciones();
       obj1 = new AreaFiguras(2,5,2.5,7);  // Instanciando objeto 1
       obj2 = new AreaFiguras(3,8,5.6,10);  // Instanciando objeto 2
       
       
       System.out.println("El area del cuadrado es"+obj1.cuadrado());
       s1.suma(12, 23.34);
       s1.suma(5, 5);
       
        //System.out.println("Hola Mundo");
        
    }
    
}
