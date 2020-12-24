package interview;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable {
    private BlockingQueue<Integer> sharedQueue;
    public ConsumerBlockingQueue(BlockingQueue<Integer> sharedQueue){
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while(true){
            try{
                System.out.println("consume value"+sharedQueue.take());
            }catch (InterruptedException ex){
                System.out.println("exception during production");
            }

        }
    }
}
