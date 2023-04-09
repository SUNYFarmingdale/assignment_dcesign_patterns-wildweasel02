/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;

/**
 *
 * @author laurabuibas
 */
public class CircleAdapter implements Shape {
    private Circle c = new Circle(); 
    public CircleAdapter(Circle c1) {
        c = c1; 
    }

    @Override
    public void draw(int a, int b, int c, int d) {
        System.out.println("the circle is being drawn with coordinates " + a + ", " + b + ", " + c + ", and " + d);
    }
    
}
