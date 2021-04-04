class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private class Circle extends Shape {
    }

    private class Quad extends Shape {
    }

    private class Triangle extends Shape {
    }

    private class Ellipse extends Shape {
    }

    private class Rectangle extends Shape {

    }


    public static void main(String[] args) {
        Shape grf = new Shape();
        Shape grf1 = new Shape();
        Shape grf2 = new Shape();
        Shape grf3 = new Shape();
        Shape grf4 = new Shape();

        grf.setName("Circle");
        grf1.setName("Quad");
        grf2.setName("Triangle");
        grf3.setName("Ellipse");
        grf4.setName("Rectangle");

        System.out.println(grf.getName());

        System.out.println(grf1.getName());

        System.out.println(grf2.getName());

        System.out.println(grf3.getName());

        System.out.println(grf4.getName());
    }

}
