package interview;

import java.util.ArrayList;
import java.util.Queue;

public class Consumer extends Thread{
private Queue<Integer> queue;
private  int maxSize;

public Consumer(Queue<Integer> queue,int maxSize,String name){
    super(name);
    this.queue = queue;
    this.maxSize = maxSize;
}

    @Override
    public void run() {
    while(true){
        synchronized (queue){
            while(queue.isEmpty()){
                System.out.println("the queue is empty consume is wating to consume");
                try{
                    queue.wait();
                }catch (InterruptedException ex){
                    System.out.println("consumer got interupted");
                }
            }

            System.out.println("consumed value"+queue.remove());
            queue.notify();
        }
    }
     }
}
