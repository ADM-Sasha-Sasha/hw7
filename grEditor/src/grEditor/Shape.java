package grEditor;

public abstract class Shape {
    private String Shape;
    public abstract String getName();

    public Shape() {
    }
    public void printShape(Shape shape){
        System.out.println("grEditor.Shape name is " + getName(Shape));
    }
    private String getName(String shape) {
        return getName();
    }

}


