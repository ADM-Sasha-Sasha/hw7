package grEditor;

class Quad extends Shape {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}