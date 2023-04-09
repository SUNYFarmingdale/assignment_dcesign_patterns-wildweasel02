/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

import com.mycompany.oldDrawingSys.Rectangle;

/**
 *
 * @author laurabuibas
 */
public class RectangleAdapter implements Shape {
    private Rectangle r = new Rectangle(); 
    public RectangleAdapter(Rectangle r1) {
        r = r1; 
    }

    @Override
    public void draw(int a, int b, int c, int d) {
        System.out.println("the rectangle is being drawn with coordinates " + a + ", " + b + ", " + c + ", and " + d);
    }
}
