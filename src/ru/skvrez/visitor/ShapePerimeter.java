package ru.skvrez.visitor;

public class ShapePerimeter implements CalculateShapeParameter {
    @Override
    public void calculate(Triangle triangle) {
        System.out.println("Calculate perimeter for " + triangle.getTitle());
    }

    @Override
    public void calculate(Rectangle rectangle) {
        System.out.println("Calculate perimeter for " + rectangle.getTitle());
    }

    @Override
    public void calculate(Circle circle) {
        System.out.println("Calculate perimeter for " + circle.getTitle());
    }
}
