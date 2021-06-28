package ru.skvrez.visitor;

public interface Shape {
    void draw();
    void accept(CalculateShapeParameter calculateArea);
}
