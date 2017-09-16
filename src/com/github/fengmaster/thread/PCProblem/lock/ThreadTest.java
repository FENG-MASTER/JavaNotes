package com.github.fengmaster.thread.PCProblem.lock;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Feng-master on 2017/9/15.
 * 测试类
 */
public class ThreadTest {

    public static void main(String args[]){



        Lock lock=new ReentrantLock();
        Condition pc=lock.newCondition();
        Condition cc=lock.newCondition();

        Queue<Integer> queue=new LinkedBlockingQueue<>();
        Consumer consumer=new Consumer(queue,10,lock,pc,cc);
        Producer producer=new Producer(queue,10,lock,pc,cc);
        Consumer consumer1=new Consumer(queue,10,lock,pc,cc);

        consumer.start();
        producer.start();
        consumer1.start();

    }


}
