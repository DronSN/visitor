package ru.skvrez.visitor;

public class Circle extends BaseShape implements Shape {

    public Circle(String title) {
        super(title);
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public void accept(CalculateShapeParameter calculateArea) {
        calculateArea.calculate(this);
    }
}
