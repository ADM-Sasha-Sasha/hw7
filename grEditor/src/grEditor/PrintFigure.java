package grEditor;

class PrintFigure implements Print {
    private Shape shape;
    public PrintFigure(Shape shape) {
        this.shape = shape;
    }
    @Override
    public void printName() {
        shape.printName();
    }
}
