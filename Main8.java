
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Rectangle yaratıldı");
    }
}
class Square extends Shape {
    public void draw() {
        System.out.println("Square yaratıldı");
    }
}
class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle yaratıldı");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Circle yaratıldı");

    }
}
class Ellipse extends Shape {
    public void draw() {
        System.out.println("Ellipse yaratıldı");

    }
}

public class Main8 {

    public static void main(String[] args) {

     
        Shape rec = new Rectangle();
        Shape squr = new Square();
        Shape elps = new Ellipse();
        Shape crcl = new Circle();
        Shape trgl = new Triangle();

        Circle crcl2 = (Circle) crcl;
        Ellipse elps2 = (Ellipse) elps;
        Triangle trgl2 = (Triangle)trgl;
        Rectangle rec2 = (Rectangle)rec;
        Square squr2 = (Square)squr;
      
        DrawingManager.draw_shapes(rec);
        DrawingManager.draw_shapes(squr);
        DrawingManager.draw_shapes(crcl);
        DrawingManager.draw_shapes(elps);
        DrawingManager.draw_shapes(trgl);
       
       
        System.out.println("\n");
        
        List<Shape> arrlist = new ArrayList<Shape>();
        arrlist.add(rec2);
        arrlist.add(squr2);
        arrlist.add(elps2);
        arrlist.add(crcl2);
        arrlist.add(trgl2);
    
        DrawingManager.drawShapes(arrlist);

    }
}

class DrawingManager {
 
    public static void draw_shapes(Shape s) {
        if (s == null) {
            throw new InvalidParameterException ("boş şekiller çizmek imkansız");
        }
        else {
        	 s.draw();
        }
       
    }
    
    public static void drawShapes(List<Shape> ls) {

        for (Shape sp : ls) {

            if (sp == null) {
                throw new InvalidParameterException("boş şekiller çizmek imkansız");
            }
            else {
            	sp.draw();
            }
        }

    }
    
}


