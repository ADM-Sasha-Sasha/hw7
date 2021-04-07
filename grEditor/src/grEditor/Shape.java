package grEditor;

public abstract class Shape implements Print {
    public abstract String getName();

    @Override
    public void printName() {
        System.out.println("Figure :" + getName());
    }
}
    //public abstract String getName();

//    private String Shape;
//
//
//    public Shape() {
//    }
//    public void printShape(Shape shape){
//        System.out.println("grEditor.Shape name is " + getName(Shape));
//    }
//    private String getName(String shape) {
//        return getName();
//    }




