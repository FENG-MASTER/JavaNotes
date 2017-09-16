package com.github.fengmaster.thread.PCProblem.syn;

import java.util.Queue;
import java.util.Random;

/**
 * Created by Feng-master on 2017/9/15.
 */
public class Producer extends Thread {

    private Queue<Integer> queue;

    private Object pLock;
    private Object cLock;

    private int maxnum;

    private Random random=new Random();

    public Producer(Queue<Integer> queue, int maxnum,Object pLock,Object cLock) {
        this.queue = queue;
        this.maxnum = maxnum;
        this.pLock=pLock;
        this.cLock=cLock;
    }


    @Override
    public void run() {

        while (true){

            synchronized (pLock){
                if (queue.size()>=maxnum){
                    //满了
                    try {
                        pLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

                int i = random.nextInt(5000);
                queue.add(i);
                System.out.println("生产者:"+getName()+" 生产了"+i);
                synchronized (cLock){
                    cLock.notify();

                }

                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }







        }


    }
}
