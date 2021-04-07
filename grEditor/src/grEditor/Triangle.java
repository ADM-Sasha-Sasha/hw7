package grEditor;

class Triangle extends Shape {
    public String name;
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}