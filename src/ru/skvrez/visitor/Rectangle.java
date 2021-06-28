package ru.skvrez.visitor;

public class Rectangle extends BaseShape implements Shape {

    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }

    @Override
    public void accept(CalculateShapeParameter calculateArea) {
        calculateArea.calculate(this);
    }
}
