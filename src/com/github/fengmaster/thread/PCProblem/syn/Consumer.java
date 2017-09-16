package com.github.fengmaster.thread.PCProblem.syn;

import java.util.Queue;

/**
 * Created by Feng-master on 2017/9/15.
 */
public class Consumer extends Thread {
    private Queue<Integer> queue;
    private Object pLock;
    private Object cLock;

    private int maxnum;

    public Consumer(Queue<Integer> queue, int maxnum, Object pLock, Object cLock) {
        this.queue = queue;
        this.maxnum = maxnum;
        this.pLock = pLock;
        this.cLock = cLock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (cLock) {
                if (queue.isEmpty()) {
                    //缓存空了
                    try {
                        cLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
            Integer poll = queue.poll();
            System.out.println("消费者:" + getName() + " 消费了" + poll);
            synchronized (pLock){
                pLock.notify();
            }


            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }




    }
}
