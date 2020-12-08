package defog.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelistExecutorDemo {

    public static void main(String[] args) {
        User user1 = new User(1,"atul");
        User user2 = new User(2,"vikash");

        ExecutorService es = Executors.newFixedThreadPool(4);
        es.submit(()->processTax(user1));
        es.submit(new Runnable() {
            @Override
            public void run() {
                processTax(user2);
            }
        });
    }

    public static void processTax(User user){
        System.out.println("this tax is processed");
    }
}
