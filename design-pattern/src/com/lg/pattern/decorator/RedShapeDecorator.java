package com.lg.pattern.decorator;

//创建扩展了 ShapeDecorator 类的实体装饰类
public class RedShapeDecorator extends ShapeDecorator {

    RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    public void setRedBorder(Shape decoratedShape) {
        System.out.println("Border is red");
    }
}
