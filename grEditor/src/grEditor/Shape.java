package grEditor;

public abstract class Shape implements Print {
    public abstract String getName();

    @Override
    public void printName() {
        System.out.println("Figure: " + getName());
    }
}





