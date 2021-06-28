package ru.skvrez.visitor;

public interface CalculateShapeParameter {
    void calculate(Triangle triangle);
    void calculate(Rectangle rectangle);
    void calculate(Circle circle);
}
