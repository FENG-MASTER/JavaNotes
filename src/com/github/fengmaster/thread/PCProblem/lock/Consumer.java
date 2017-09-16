package com.github.fengmaster.thread.PCProblem.lock;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created by Feng-master on 2017/9/15.
 * 消费者
 */
public class Consumer extends Thread {
    private Queue<Integer> queue;
    private Lock pLock;
    private Condition pc;
    private Condition cc;

    private int maxnum;

    public Consumer(Queue<Integer> queue, int maxnum, Lock pLock,Condition pc,Condition cc) {
        this.queue = queue;
        this.maxnum = maxnum;
        this.pLock = pLock;
        this.pc=pc;
        this.cc=cc;
    }

    @Override
    public void run() {
        while (true) {

            pLock.lock();
            //这里如果用if,会出现读取到null的情况
            //原因是,可能本消费者被唤醒后,唯一的数据被其他消费者先消费,然后再执行本消费者,这个时候是null
            while (queue.isEmpty()){

                try {
                    System.out.println(getName()+" wait");
                    cc.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            Integer poll = queue.poll();
            System.out.println("消费者:" + getName() + " 消费了" + poll);
            pc.signal();

            pLock.unlock();

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }




    }
}
