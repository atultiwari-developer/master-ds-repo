package interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 10;
        Thread producer = new ProducerThread(queue,maxSize,"PRODUCER");
        Thread consumer = new Consumer(queue,maxSize,"PRODUCER");
        producer.start();
        consumer.start();


    }


}
