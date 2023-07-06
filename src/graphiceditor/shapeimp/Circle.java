package graphiceditor.shapeimp;

import graphiceditor.Shape;
import graphiceditor.ShapeColor;


public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public Circle(double radius, ShapeColor shapeColor) {
        super("Circle", shapeColor);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
