package com.test;

import org.apache.commons.beanutils.BeanUtils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Apple implements Runnable{
    private Integer num1 = 50;
    private final Lock lock = new ReentrantLock();
    public void run() {
        // TODO
        for (int i = 0; i < 50; i++) {
            //同步代码块
            lock.lock();
            try{
                if(num1 > 0) {
                    System.out.println(Thread.currentThread().getName() + "吃了第" + num1-- + "个苹果");
                    //模拟网络延迟
                }
            }catch (Exception e){

            }finally {
                lock.unlock();
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }

}
//同步代码块
public class SynchronizedBloceDemo {
    public static void main(String[] args) {
        Apple p = new Apple();
        new Thread(p, "A").start();
        new Thread(p, "B").start();
        new Thread(p, "C").start();
    }
}

