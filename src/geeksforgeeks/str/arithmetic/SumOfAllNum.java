package geeksforgeeks.str.arithmetic;

public class SumOfAllNum {
    public static void main(String[] args) {
        String str = "12abc20yz68";
        int ans = findSum(str);
        System.out.println(ans);

    }
    public static int findSum(String str){
        int ans = 0;
        String numStr="0";
        int len = str.length();
      for(int i=0;i<len;i++) {
          Character ch = str.charAt(i);
          if(Character.isDigit(ch)){
              numStr+=ch;
          }
          else{
              ans = ans + Integer.parseInt(numStr);
              numStr = "0";
          }
        }
      return ans + Integer.parseInt(numStr);


    }
}
