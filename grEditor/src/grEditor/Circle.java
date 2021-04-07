package grEditor;

class Circle extends Shape {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
