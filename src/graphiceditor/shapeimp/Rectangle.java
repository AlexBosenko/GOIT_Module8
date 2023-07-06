package graphiceditor.shapeimp;

import graphiceditor.Shape;
import graphiceditor.ShapeColor;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA, double sideB, ShapeColor shapeColor) {
        super("Rectangle", shapeColor);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB) * 2.0;
    }
}
