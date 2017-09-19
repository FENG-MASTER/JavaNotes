package com.github.fengmaster.design.pattern.factory.simple;

/**
 * Created by Feng-master on 2017/9/16.
 * 简单工厂方法(一般认为这个不是模式)
 */
public class SimpleFactory {

    public static final int CLASS1 = 1;
    public static final int CLASS2 = 2;
    public static final int CLASS3 = 3;

    public static IClass createClass(int type) {
        switch (type) {
            case CLASS1:
                return new Class1();
            case CLASS2:
                return new Class2();
            case CLASS3:
                return new Class3();
            default:
                return null;
        }

    }

}
