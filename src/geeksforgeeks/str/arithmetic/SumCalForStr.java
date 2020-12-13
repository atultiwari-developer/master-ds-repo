package geeksforgeeks.str.arithmetic;

public class SumCalForStr {

    public static void main(String[] args) {
        String str1 = "12";
        String str2 = "198111";

        String res = calculateSum(str1,str2);
        System.out.println("the res is"+res);
    }

    private static String calculateSum(String str1, String str2) {
        if(str1.length()>str2.length()){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        String res = "";
        int n1 = str1.length();
        int n2 = str2.length();
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();
        int carry = 0;
        for(int i=0;i<n1;i++){
            int sum = (str1.charAt(i)-'0') + (str2.charAt(i)-'0') + carry;
            carry = sum /10;
            res+=(char)(sum%10 +'0');
        }
        for(int j=n1;j<n2;j++){
            int sum = (str2.charAt(j)-'0') + carry;
            carry = sum/10;
            res+=(char)(sum%10+'0');
        }
        if(carry>0){
            res+=(char)(carry-'0');
        }
        res = new StringBuilder(res).reverse().toString();
        return res;
    }
}
