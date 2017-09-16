package com.github.fengmaster.design.pattern.singleton;

/**
 * Created by Feng-master on 2017/9/16.
 * 最简单的单例模式,这种实现方式会自动创建对象
 *
 * 缺点:有时候本单例根本用不到,但还是会创建对象,占用空间
 * 优点:简单,且适用于多线程环境
 */
public class Singleton1 {

    private static Singleton1 instance=new Singleton1();

    private Singleton1(){

    }

    public Singleton1 getInstance(){
        return instance;
    }

}
