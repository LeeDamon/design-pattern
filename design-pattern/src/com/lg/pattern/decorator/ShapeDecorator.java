package com.lg.pattern.decorator;


//创建实现了 Shape 接口的抽象装饰类
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    ShapeDecorator(Shape decoratedShape){
        this.decoratedShape=decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
