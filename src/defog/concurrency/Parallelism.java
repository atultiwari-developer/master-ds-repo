package defog.concurrency;

public class Parallelism {

    public static void main(String[] args) {
        User user1 = new User(1,"atul");
        User user2 = new User(2,"vikash");
        new Thread(new Runnable() {
            @Override
            public void run() {
                processTax(user1);
            }
        }).start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                processTax(user2);
            }
        }).start();

        heavyCalculation();
    }

    private static void heavyCalculation() {
        System.out.println("this is heavy calculation method");
    }

    public static void processTax(User user){
        System.out.println("this tax is processed");
    }
}
