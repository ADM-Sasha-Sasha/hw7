package grEditor;

public class Ellipse extends Shape {
    private String name;

    public Ellipse() {
        this.name = "Ellipse";
    }
    @Override
    public String getName() {
        return name;
    }
}