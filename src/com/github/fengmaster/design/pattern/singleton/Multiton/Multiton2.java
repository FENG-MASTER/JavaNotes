package com.github.fengmaster.design.pattern.singleton.Multiton;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Feng-master on 2017/9/26.
 * 单例模式拓展:多例模式
 * <p>
 * 应用场景:线程池等其他相关的资源场景
 */
public class Multiton2 {

    private static final int num = 5;
    private static List<Multiton2> multiton2List = Nested.list;
    private static Random random = new Random();
    private Multiton2() {
        System.out.println("new Multiton2");
    }

    public static Multiton2 getInstance() {
        return multiton2List.get(random.nextInt(num));
    }


    public static class Nested {

        private static List<Multiton2> list = new CopyOnWriteArrayList<>();

        static {
            for (int i = 0; i < num; i++) {
                list.add(new Multiton2());
            }

        }

    }

    public static void main(String args[]){
        //测试多线程环境下情况
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for (int i=0;i<30;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<30;i++){
                        Multiton2 multiton2=Multiton2.getInstance();
                    }

                }
            });
        }



    }

}
