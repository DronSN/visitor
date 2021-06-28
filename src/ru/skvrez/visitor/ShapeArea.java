package ru.skvrez.visitor;

public class ShapeArea implements CalculateShapeParameter {
    @Override
    public void calculate(Triangle triangle) {
        System.out.println("Calculate area for " + triangle.getTitle());
    }

    @Override
    public void calculate(Rectangle rectangle) {
        System.out.println("Calculate area for " + rectangle.getTitle());
    }

    @Override
    public void calculate(Circle circle) {
        System.out.println("Calculate area for " + circle.getTitle());
    }
}
