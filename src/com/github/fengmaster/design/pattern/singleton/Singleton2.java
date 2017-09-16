package com.github.fengmaster.design.pattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Feng-master on 2017/9/16.
 * 负责一点的单例模式实现
 *
 * 优点:支持多线程,且效率较高,并且不会直接生成单例对象,只有需要用的时候才会生成
 * 缺点:复杂,不过其实就多了两句代码.
 *
 *
 */
public class Singleton2 {

    private static Singleton2 instance;



//这个写法不能用于多线程环境下
//    public static Singleton2 getInstance(){
//        if (instance==null){
//            instance=new Singleton2();
//        }
//        return instance;
//    }


    /**
     * 这种双重锁的方式能够实现在多线程环境下不出错,
     * 并且不需要直接把方法设置为synchronized,效率比直接synchronized整个方法要高很多
     * @return
     */
    public static Singleton2 getInstance(){

        if (instance==null){
            synchronized (Singleton2.class){
                if (instance==null){
                    instance=new Singleton2();
                }
            }

        }

        return instance;


    }

    private Singleton2(){
        System.out.println("new Singleton2");
    }

    public static void main(String args[]){
        //测试多线程环境下情况
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for (int i=0;i<30;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Singleton2 instance = Singleton2.getInstance();
                }
            });
        }



    }

}
