package graphiceditor.shapeimp;

import graphiceditor.Shape;
import graphiceditor.ShapeColor;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(double sideA, double sideB, double sideC, ShapeColor shapeColor) {
        super("Triangle", shapeColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB + sideC);
    }
}
