package interview;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;

public class ProducerThread extends  Thread{
    private Queue<Integer> queue;
    private int maxSize;

    public ProducerThread(Queue<Integer> queue,int maxSize,String name){
        super(name);
        this.queue =queue;
        this.maxSize = maxSize;

    }

    @Override
    public void run() {
        while(true){
            synchronized (queue){
                while(queue.size()==maxSize){
                    try{
                        System.out.println("queue is full producer thread waiting for consumer to consume something");
                        queue.wait();
                    }catch (InterruptedException ex){
                        System.out.println("interupted exception");
                    }
                }
                Random random = new Random();
                int i = random.nextInt();
                System.out.println("producing value"+i);
                queue.add(i);
                queue.notify();
            }
        }
    }
}
