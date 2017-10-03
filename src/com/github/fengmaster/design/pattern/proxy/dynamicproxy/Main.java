package com.github.fengmaster.design.pattern.proxy.dynamicproxy;

import java.lang.reflect.*;

/**
 * Created by Feng-master on 2017/10/3.
 *
 * 动态代理
 */
public class Main {

    public static void main(String args[]) {
        IExecutor executor = (IExecutor) java.lang.reflect.Proxy.newProxyInstance(
                        ConcreteExecutor.class.getClassLoader(),
                        new Class[]{IExecutor.class},
                        new Proxy(new ConcreteExecutor("name")));

        executor.fun1();
    }

}
