/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

import com.mycompany.oldDrawingSys.Circle;
import com.mycompany.oldDrawingSys.Rectangle;

/**
 * this is the adapter class
 * @author MoaathAlrajab
 */
public class ModifiedSystem {
    public static void main(String[] args) {
        Circle c = new Circle(); 
        Rectangle r = new Rectangle();
        Shape[] shapes = {new CircleAdapter(c), new RectangleAdapter(r)};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}
