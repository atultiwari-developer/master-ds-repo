package geeksforgeeks.str.charactercountbased;

public class CountEnglishChar {

    public static void main(String[] args) {
        String str = "ABcED";
       int count =  getCount(str);
        System.out.println("the count is"+count);


    }

    public static int getCount(String str){
        int res =0;
        int n = str.length();
        int i=0;
        for(i=0;i<n;i++){
            if(i==(str.charAt(i)-'a') || i== (str.charAt(i)-'A')){
                res++;
            }

        }
        return res;
    }
}
