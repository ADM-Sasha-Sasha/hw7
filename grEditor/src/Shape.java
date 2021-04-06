import java.util.Arrays;

public abstract class Shape {
    public abstract String getName();

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

    class Ellipse extends Shape {
        public String name;

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    class Rectangle extends Shape {
        public String name;

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return null;
        }
    }

    public interface Print {
        public void printName();
    }

    class NamePrinter {
        public static void main(String[] args) {
            System.out.println(Arrays.toString(new String[]{"Circle", "Quad", "Triangle", "Ellipse", "Rectangle"}));
        }
    }
}

