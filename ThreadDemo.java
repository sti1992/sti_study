package com.sti.test_springboot.Test;

import java.util.concurrent.*;

/**
 * @version 1.0
 * @Author sti
 * @Date 2022/03/27 21:06
 */
public class ThreadDemo {


    public static void main(String[] args) throws Exception {
        //1
        Callable<Integer> c1 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        };
        Integer call = c1.call();
        System.out.println(call);

        //2
        ThreadPoolExecutor e1 = new ThreadPoolExecutor(1, 2, 10, TimeUnit.SECONDS, new SynchronousQueue<>());
        Future<Integer> f1 = e1.submit(c1);
        Integer integer = f1.get()+1;
        System.out.println(integer);
        e1.shutdown();
        //3
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> f2 =  executorService.submit(()->{return 3;});
        System.out.println(f2.get());

        //4
        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(()->{return 4;});
        System.out.println(cf.get());

        //5
        DemoThread d1 = new DemoThread();
        Thread t11 = new Thread(d1);
        t11.start();
        Thread.sleep(1000);
        System.out.println(d1.data());

    }
    static final class DemoThread implements Runnable{
        int a ;
        @Override
        public void run() {
            a=5;
        }
        public Integer data() {
            return a;
        }
    }

}
