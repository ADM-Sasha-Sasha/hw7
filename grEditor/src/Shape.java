import javax.lang.model.element.Name;

public abstract class Shape {
    public abstract String name();


    class Circle extends Shape {
        public String Name;

        public String getName() {
            return Name;
        }

        @Override
        public String name() {
            //System.out.println("Circle");
            return "Circle";
        }
    }

    class Quad extends Shape {
        public String Name;

        public String getName() {
            return Name;
        }

        @Override
        public String name() {
            //System.out.println("Quad");
            return "Quad";
        }
    }

    class Triangle extends Shape {
        public String Name;

        public String getName() {
            return Name;
        }

        @Override
        public String name() {
            //System.out.println("Tringle");
            return "Tringle";
        }
    }

    class Ellipse extends Shape {
        public String Name;

        public String getName() {
            return Name;
        }

        @Override
        public String name() {
            //System.out.println("Ellipse");
            return "Ellipse";
        }
    }

    class Rectangle extends Shape {
        public String Name;

        public String getName() {
            return Name;
        }

        @Override
        public String name() {
            //System.out.println("Rectangle");
            return "Rectangle";
        }
    }

    public Shape() {
    }

    public static void main(String[] args) {
        System.out.println();
    }
}