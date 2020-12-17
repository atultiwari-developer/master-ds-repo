package geeksforgeeks.str.arithmetic;

public class CaculateMaxSumStr {

    public static void main(String[] args) {
        String str = "01891";
        int res = calculateMaxSum(str);
        System.out.println("the res"+res);
    }

    private static int calculateMaxSum(String str) {
        int ans = 0;
        int lenght = str.length();
        if(str.length()>0)
            ans = str.charAt(0)-'0';

        for(int i=1;i<lenght;i++){
            if(str.charAt(i)=='0' || str.charAt(i)=='1' || ans<2){
                ans+=str.charAt(i)-'0';
            }
            else{
                ans*=str.charAt(i)-'0';
            }
        }
       return ans;
    }
}
