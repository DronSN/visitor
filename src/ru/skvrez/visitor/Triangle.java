package ru.skvrez.visitor;

public class Triangle extends BaseShape implements Shape {

    public Triangle(String title) {
        super(title);
    }

    @Override
    public void draw() {
        System.out.println("Draw triangle");
    }

    @Override
    public void accept(CalculateShapeParameter calculateArea) {
        calculateArea.calculate(this);
    }
}
