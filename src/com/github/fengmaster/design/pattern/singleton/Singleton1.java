package com.github.fengmaster.design.pattern.singleton;

/**
 * Created by Feng-master on 2017/9/16.
 * 最简单的单例模式,这种实现方式会自动创建对象
 *
 * 缺点:有时候本单例根本用不到,但还是会创建对象,占用空间
 * 优点:简单,且适用于多线程环境
 *
 * {@link Singleton3}和第三种方法区别在于,1版本的单例模式,只要这个class被类加载器加载后,就会创建对象
 * 而3版本的单例模式,就算class被加载,也不会创建对象,只有在显式调用了{@link Singleton3#getInstance()}函数的时候
 * 才会创建单例对象
 *
 *
 */
public class Singleton1 {

    private static Singleton1 instance=new Singleton1();

    private Singleton1(){

    }

    public Singleton1 getInstance(){
        return instance;
    }

}
