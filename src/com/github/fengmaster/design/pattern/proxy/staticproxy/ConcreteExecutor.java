package com.github.fengmaster.design.pattern.proxy.staticproxy;

/**
 * Created by Feng-master on 2017/9/30.
 *
 * 实体执行类.
 */
public class ConcreteExecutor implements IExecutor {

    private String name;

    public ConcreteExecutor(String name){
        this.name=name;
    }

    @Override
    public void fun1() {
        System.out.println(name+"执行了"+"fun1");
    }

    @Override
    public void fun2() {
        System.out.println(name+"执行了"+"fun2");
    }

    @Override
    public void fun3() {
        System.out.println(name+"执行了"+"fun3");
    }
}
