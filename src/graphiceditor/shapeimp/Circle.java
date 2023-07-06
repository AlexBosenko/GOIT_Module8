package graphiceditor;

public class Circle extends Shape {
    private int radius;

    public Circle(String name) {
        super(name);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
