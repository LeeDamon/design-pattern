package com.lg.pattern.factory.abstractFactory;

import com.lg.pattern.factory.Milk;

/**
 * 抽象方法模式是生产中主流的工厂模式
 * 这种方式符合编程中的开闭原则， 易于拓展
 */
public interface AbstractFactory {

    Milk getMengniu();

    Milk getYili();

    Milk getTelunsu();
}
