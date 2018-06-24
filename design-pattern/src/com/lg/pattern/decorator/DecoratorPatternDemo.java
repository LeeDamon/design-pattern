package com.lg.pattern.decorator;


//测试装饰类
public class DecoratorPatternDemo {
    public static void main(String[] args) {


        Shape circle = new Cricle();

        Shape redCircle = new RedShapeDecorator(new Cricle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }
}
