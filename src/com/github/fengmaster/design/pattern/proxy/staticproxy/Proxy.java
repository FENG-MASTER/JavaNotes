package com.github.fengmaster.design.pattern.proxy.staticproxy;

/**
 * Created by Feng-master on 2017/9/30.
 *
 * 普通代理类,也叫静态代理
 *
 * 主要作用除了简单代理执行一些实体对象的方法外,还可以在方法执行前后 注入相应代码 .
 */
public class Proxy implements IExecutor{
    private IExecutor executor;

    /**
     * 传入要代理的实体类
     * @param iExecutor 实体类
     */
    public Proxy(IExecutor iExecutor){
        executor=iExecutor;
    }

    @Override
    public void fun1() {
        //我们可以在执行本体方法的前执行一些代码 (代码注入)
        doBeforeFun1();
        executor.fun1();
        //我们也可以在执行本体方法后执行一些代码 (代码注入)
        doAfterFun1();
    }

    @Override
    public void fun2() {
        doBeforeFun2();
        executor.fun2();
        doAfterFun2();
    }

    @Override
    public void fun3() {
        doBeforeFun3();
        executor.fun3();
        doAfterFun3();
    }


    private void doBeforeFun1(){
        System.out.println("fun1执行前");
    }

    private void doAfterFun1(){
        System.out.println("fun1执行后");
    }

    private void doBeforeFun2(){
        System.out.println("fun2执行前");
    }

    private void doAfterFun2(){
        System.out.println("fun2执行后");
    }


    private void doBeforeFun3(){
        System.out.println("fun3执行前");
    }

    private void doAfterFun3(){
        System.out.println("fun3执行后");
    }
}
