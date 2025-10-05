package io.github.traininglabz.solid.lsp;

import lombok.Data;

class ExampleProblem {

    @Data
    static class Rectangle {
        private double length;
        private double width;

        public double getArea() {
            return length * width;
        }
    }

    static class Square extends Rectangle {

        @Override
        public void setLength(double length) {
            super.setLength(length);
            super.setWidth(length);
        }

        @Override
        public void setWidth(double width) {
            super.setWidth(width);
            super.setLength(width);
        }
    }

    public static void run() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(20);
        System.out.println("Area of rectangle: " + rectangle.getArea());

        Rectangle square = new Square();
        square.setLength(10);
        square.setWidth(20);
        System.out.println("Area of square: " + square.getArea());
    }
}
