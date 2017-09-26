package com.github.fengmaster.design.pattern.singleton.Multiton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Feng-master on 2017/9/26.
 * 单例模式拓展:多例模式
 * <p>
 * 应用场景:线程池等其他相关的资源场景
 */
public class Multiton1 {

    private static final int num = 5;
    private static List<Multiton1> multiton1List = new ArrayList<>();
    private static Random random = new Random();

    static {
        for (int i = 0; i < num; i++) {
            multiton1List.add(new Multiton1(i));
        }

    }

    private Multiton1(int i) {
        System.out.println("new Multiton1 index:"+i);

    }

    public static Multiton1 getInstance() {
        return multiton1List.get(random.nextInt(num));
    }

    public static void main(String args[]){
        //测试多线程环境下情况
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for (int i=0;i<30;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<30;i++){
                        Multiton1 multiton1=Multiton1.getInstance();
                    }

                }
            });
        }



    }


}
