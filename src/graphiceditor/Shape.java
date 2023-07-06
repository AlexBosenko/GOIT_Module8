package graphiceditor;

abstract public class Shape implements Drawable, Borderable {
    private final String name;
    private ShapeColor shapeColor;
    private double borderWidth;

    public Shape(String name) {
        this.name = name;
        this.shapeColor = ShapeColor.BLACK;
        this.borderWidth = 1.0;
    }

    public Shape(String name, ShapeColor shapeColor) {
        this(name);
        setColor(shapeColor);
    }

    public Shape(String name, ShapeColor shapeColor, double borderWidth) {
        this(name);
        setColor(shapeColor);
        setBorderWidth(borderWidth);
    }

    public String getName() {
        return name;
    }

    @Override
    public void setColor(ShapeColor shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public void draw() {
        System.out.println("Drawing a " + getName() + " of " + shapeColor.name() + " color");
        System.out.println("Border width  = " + borderWidth);
    }

    @Override
    public double getBorderWidth() {
        return borderWidth;
    }

    @Override
    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }
}
