package ru.skvrez.visitor;

public class Main {

    public static void main(String[] args) {
        CalculateShapeParameter calculateArea = new ShapeArea();
        CalculateShapeParameter calculatePerimeter = new ShapePerimeter();

        Shape rectangle = new Rectangle("my super rectangle");
        rectangle.draw();
        rectangle.accept(calculateArea);
        rectangle.accept(calculatePerimeter);

        Shape triangle = new Triangle("my super triangle");
        triangle.draw();
        triangle.accept(calculateArea);
        triangle.accept(calculatePerimeter);

        Shape circle = new Circle("my super circle");
        circle.draw();
        circle.accept(calculateArea);
        circle.accept(calculatePerimeter);
    }
}
