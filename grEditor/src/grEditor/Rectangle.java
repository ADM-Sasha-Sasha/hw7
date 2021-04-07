package grEditor;

public class Rectangle extends Shape {
    private String name;

    public Rectangle() {
        this.name = "Rectangle";
    }
    @Override
    public String getName() {
        return name;
    }
}