package geeksforgeeks.str.arithmetic;

public class MaxNumericValue {
    public static void main(String[] args) {
        String str = "100klh564abc365bg";
        int res = getMaxNumValue(str);
        System.out.println("the res is"+res);

    }
    public static int getMaxNumValue(String str){
        int num = 0;
        int res = 0;
        int strlen = str.length();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                num = num*10+(str.charAt(i)-'0');
            }
            else
            {
                res = Math.max(num,res);
                num = 0;
            }
        }
        return Math.max(num,res);
    }
}
