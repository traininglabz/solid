package io.github.traininglabz.solid.lsp;

import lombok.Data;

class ExampleSolution {

    interface Shape {
        double getArea();
    }

    @Data
    static class Rectangle implements Shape {

        double length;
        double width;

        @Override
        public double getArea() {
            return length * width;
        }
    }

    @Data
    static class Square implements Shape {

        double side;

        @Override
        public double getArea() {
            return side * side;
        }
    }

    public static void run() {
        Shape shape;
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(20);
        shape = rectangle;
        System.out.println("Area of rectangle: " + shape.getArea());

        Square square = new Square();
        square.setSide(10);
        shape = square;
        System.out.println("Area of square: " + shape.getArea());
    }


}
