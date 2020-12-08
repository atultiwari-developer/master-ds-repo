class Base{
    public String name = "base";
    public String getName(){
        return name;
    }

}


public class Child extends Base {
    private final String name = "child";
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        System.out.println(new Child().name);
        System.out.println(new Child().getName());
    }

}
