package geeksforgeeks.str.arithmetic;

public class DivisibleByN {
    public static void main(String[] args) {
        int n=  20;
        resultNum(n);
    }

    private static void resultNum(int n) {
        if(n==0){
            System.out.print("0");
        }
        if(n%9 !=0){
            System.out.print(n%9);
        }

        for(int i=1;i<=(n/9);i++){
            System.out.print("9");
        }
        for(int i=1;i<=n;i++){
            System.out.print("0");
            System.out.print("" );
        }
    }
}
