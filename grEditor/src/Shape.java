public abstract class Shape {
    private String Shape;
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

    public Shape() {
    }
    public void printShape(Shape shape){
        System.out.println("Shape name is " + getName(Shape));
    }
    private String getName(String shape) {
        return getName();
    }

    class main {
        public static void main(String[] args) {
            Shape shapeFormatter = new Shape() {
//                @Override
//                public String getName() {
//                    return getName();
//                }
            };
        }
    }
}


