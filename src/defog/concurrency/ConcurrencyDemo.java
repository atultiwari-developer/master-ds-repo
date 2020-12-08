package defog.concurrency;
import java.util.concurrent.locks.*;
public class ConcurrencyDemo {
    private static  int availableTicket;
     static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        new Thread(()->{
            lock.lock();
            if(availableTicket>0){
                bookTicket();
                availableTicket--;
            }
            lock.unlock();
        }).start();

        new Thread(()->{
            lock.lock();
            if(availableTicket>0){
                bookTicket();
                availableTicket--;
            }
            lock.unlock();
        }).start();
    }

    private static void bookTicket() {
        System.out.println("this is the ticket booking function");
    }
}
