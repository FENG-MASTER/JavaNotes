package com.github.fengmaster.thread.syn;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Feng-master on 2017/9/15.
 */
public class ThreadTest {

    public static void main(String args[]){

        Object pLock=new Object();
        Object cLock=new Object();

        Lock lock=new ReentrantLock();

        Queue<Integer> queue=new LinkedBlockingQueue<>();
        Consumer consumer=new Consumer(queue,10,pLock,cLock);
        Producer producer=new Producer(queue,10,pLock,cLock);
        Consumer consumer1=new Consumer(queue,10,pLock,cLock);

        consumer.start();
        producer.start();
        consumer1.start();

    }


}
