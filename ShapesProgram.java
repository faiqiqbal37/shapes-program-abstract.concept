/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesprogram;

/**
 *
 * @author OMEN
 */
public class ShapesProgram {    // This is our test class.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Shape shapearr[] = new Shape[6];  // The address of a child class can be stored in parent class.
        shapearr[0] = new Rectangle();
    shapearr[1] = new Rectangle(10,20);
        shapearr[2] = new Rectangle(10,20,"Yellow",true);
        shapearr[3] = new Square();
        shapearr[4] = new Square(5);
        shapearr[5] = new Square(5, "Purple", false);
        
        for (Shape shapearr1 : shapearr) {
            System.out.println(shapearr1);
        }
        
        
        
        
        
    }
    
}

/* Observation:1 Yes an error occurs because the rectangle class extends shape class and has to override
the methods of its parent class.
*/

/* Observation:2 Yes an error occurs when we remove the abstract keyword from the shape class because 
in shape class we have declared abstract methods which can only be done in a abstract class.

*/

//Yes, an error occurs becasue we can not creat objects of abstract class.


