package com.github.fengmaster.thread.PCProblem.lock;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created by Feng-master on 2017/9/15.
 * 生产者
 */
public class Producer extends Thread {

    private Queue<Integer> queue;
    private Lock lock;

    private Condition pc;
    private Condition cc;

    private int maxnum;

    private Random random=new Random();

    public Producer(Queue<Integer> queue, int maxnum, Lock lock,Condition pc,Condition cc) {
        this.queue = queue;
        this.maxnum = maxnum;
        this.lock =lock;
        this.pc=pc;
        this.cc=cc;
    }


    @Override
    public void run() {

        while (true){

            lock.lock();

            while (queue.size()>=maxnum){
                try {
                    System.out.println(getName()+" wait");
                    pc.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

                int i = random.nextInt(5000);
                queue.add(i);
                System.out.println("生产者:"+getName()+" 生产了"+i);
                cc.signal();


            lock.unlock();

            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
