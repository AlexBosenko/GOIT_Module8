package graphiceditor.shapeimp;

import graphiceditor.Shape;
import graphiceditor.ShapeColor;

public class RegularPentagon extends Shape {
    private double sideA;

    public RegularPentagon(double sideA) {
        super("RegularPentagon");
        this.sideA = sideA;
    }

    public RegularPentagon(double sideA, ShapeColor shapeColor) {
        super("RegularPentagon", shapeColor);
        this.sideA = sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return 5.0 / 2.0 * sideA * Math.sqrt(Math.pow((sideA / (2 * Math.sin(Math.PI / 5))), 2) - (Math.pow(sideA, 2) / 4));
    }

    @Override
    public double getPerimeter() {
        return sideA * 5.0;
    }
}
