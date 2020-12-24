package geeksforgeeks.str.charactercountbased;

public class CountSubString {

    public static void main(String[] args) {
        String str = "abc";
        int res = countSubStr(str);

        System.out.println("the res is"+res);


    }

    public static int countSubStr(String str){
        int n  =str.length();

        return n*(n+1)/2;

    }
}
