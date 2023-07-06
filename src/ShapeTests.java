import graphiceditor.shapeimp.*;
import graphiceditor.PrintShapeName;
import graphiceditor.Shape;
import graphiceditor.ShapeColor;

public class ShapeTests {
    public static void main(String[] args) {
        Shape circle = new Circle(25);
        circle.setColor(ShapeColor.BLUE);
        System.out.println("circle.getArea() = " + circle.getArea());
        System.out.println("circle.getPerimeter() = " + circle.getPerimeter());

        Shape rectangle = new Rectangle(10, 30);
        System.out.println("rectangle.getArea() = " + rectangle.getArea());
        System.out.println("rectangle.getPerimeter() = " + rectangle.getPerimeter());

        Shape ellipse = new Ellipse(25, 25);
        System.out.println("ellipse.getArea() = " + ellipse.getArea());
        System.out.println("ellipse.getPerimeter() = " + ellipse.getPerimeter());

        Shape triangle = new Triangle(10, 10, 15);
        System.out.println("triangle.getArea() = " + triangle.getArea());
        System.out.println("triangle.getPerimeter() = " + triangle.getPerimeter());

        Shape regularPentagon = new RegularPentagon(20, ShapeColor.YELLOW);
        regularPentagon.setBorderWidth(2.5);
        System.out.println("regularPentagon.getArea() = " + regularPentagon.getArea());
        System.out.println("regularPentagon.getPerimeter() = " + regularPentagon.getPerimeter());


        PrintShapeName printShapeName = new PrintShapeName();
        printShapeName.printShape(circle);
        printShapeName.printShape(rectangle);
        printShapeName.printShape(ellipse);
        printShapeName.printShape(triangle);
        printShapeName.printShape(regularPentagon);

        circle.draw();
        rectangle.draw();
        ellipse.draw();
        triangle.draw();
        regularPentagon.draw();
    }
}
