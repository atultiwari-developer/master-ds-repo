package interview;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<Integer> sharedQueue = new LinkedBlockingDeque<>();
        Thread producerThread = new Thread(new ProdeucerBlockingQueue(sharedQueue),"PRODUCER");
        Thread consumerThread = new Thread(new ConsumerBlockingQueue(sharedQueue),"CONSUMER");
        producerThread.start();
        consumerThread.start();

    }
}
