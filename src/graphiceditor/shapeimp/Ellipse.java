package graphiceditor.shapeimp;

import graphiceditor.Shape;
import graphiceditor.ShapeColor;

public class Ellipse extends Shape {
    private double smallRadius;
    private double bigRadius;

    public Ellipse(double smallRadius, double bigRadius) {
        super("Circle");
        this.smallRadius = smallRadius;
        this.bigRadius = bigRadius;
    }

    public Ellipse(double smallRadius, double bigRadius, ShapeColor shapeColor) {
        super("Circle", shapeColor);
        this.smallRadius = smallRadius;
        this.bigRadius = bigRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * smallRadius * bigRadius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(smallRadius, 2) + Math.pow(bigRadius, 2)) / 2);
    }
}
