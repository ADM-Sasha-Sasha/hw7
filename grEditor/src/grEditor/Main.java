package grEditor;

class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle();
        shapes[1] = new Ellipse();
        shapes[2] = new Quad();
        shapes[3] = new Triangle();
        shapes[4] = new Rectangle();
        for (Shape shape : shapes) {
            new PrintFigure(shape).printName();
        }
    }
}
