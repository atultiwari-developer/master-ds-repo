package interview;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProdeucerBlockingQueue implements Runnable{
    private BlockingQueue<Integer> sharedQueue;

    public ProdeucerBlockingQueue(BlockingQueue<Integer> sharedQueue){
        this.sharedQueue = sharedQueue;
    }


    @Override
    public void run() {
        while (true){
            Random random = new Random();
            int x = random.nextInt(100);
            System.out.println("producing value"+x);
            try{
                sharedQueue.put(x);
            }catch (InterruptedException ex){
                System.out.println("Exception during producing");
            }
        }
    }
}
