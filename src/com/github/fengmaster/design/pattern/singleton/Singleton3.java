package com.github.fengmaster.design.pattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Feng-master on 2017/9/16.
 * 更加复杂一点的单例模式,写法比较骚
 * 有没有用于多线程,却不使用synchronized的办法?有!
 *
 * 缺点:写法太骚了,很难记
 * 优点:支持多线程,且不需要因为多线程同步而有效率损耗
 *
 */
public class Singleton3 {

    private static Singleton3 instance=Nested.singleton;


    public static Singleton3 getInstance(){
        return instance;
    }

    private Singleton3(){
        System.out.println("new Singleton3");
    }

    public static class Nested{

        private Nested(){

        }

        public static Singleton3 singleton=new Singleton3();

    }

    public static void main(String args[]){
        //测试多线程环境下情况
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for (int i=0;i<30;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Singleton3 instance = Singleton3.getInstance();
                }
            });
        }



    }
}
