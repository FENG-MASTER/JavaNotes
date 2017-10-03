package com.github.fengmaster.design.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Feng-master on 2017/10/3.
 *
 * 动态代理
 */
public class Proxy implements InvocationHandler {
    private Object target;

    public Proxy(Object target) {
        this.target = target;
    }

    /**
     * 函数执行动态绑定
     * @param proxy 动态代理实例,不是本对象(InvocationHandler),这个实例包括了本对象而已(从例子中看即是Main中的executor)
     * @param method 调用的方法
     * @param args 参数
     * @return 方法返回值
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("fun1")){
            //注入代码
            System.out.println("fun1执行前");
        }
        //如果你愿意,你也可以修改传入的参数
        Object res=method.invoke(target,args);
        //当然,如果你愿意,你甚至可以修改返回值

        if (method.getName().equals("fun1")){
            //注入代码
            System.out.println("fun1执行后");
        }

        return res;
    }
}
