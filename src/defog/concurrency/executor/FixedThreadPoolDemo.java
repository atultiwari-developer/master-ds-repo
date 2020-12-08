package defog.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        for(int i=0;i<1000;i++){
            es.execute(new Task());
        }

    }
    static class Task implements Runnable{
        @Override
        public  void run(){
            System.out.println("name of the thread"+Thread.currentThread().getName());
        }
    }

}
