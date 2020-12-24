package geeksforgeeks.str.charactercountbased;

import java.util.HashSet;
import java.util.Set;

public class DistinctStringWithOddEven {

    static int MAX_CHAR=26;
    public static void main(String[] args) {
       String arr[] = {"abcd", "cbad", "bacd"};
       int n = arr.length;
       int res =  countDistinct(arr,n);
        System.out.println("the res is"+res);

    }

    static int countDistinct(String arr[],int n){
        int res = 0;
        Set<String> hs = new HashSet<>();

        for(int i=0;i<n;i++){
            if(!hs.contains(encodeStr(arr[i].toCharArray()))){
                hs.add(encodeStr(arr[i].toCharArray()));
                res++;
            }
        }


        return res;

    }

    public static String encodeStr(char[] str){
        int[]even = new int[26];
        int[]odd = new int[26];
        String encoding="";

        for(int i=0;i<str.length;i++){
            char ch = str[i];
            if(i%2==1){
                odd[ch-'a']++;
            }
            else
                even[ch-'a']++;
        }

        for(int i=0;i<MAX_CHAR;i++){
            encoding+=even[i];
            encoding+=('-');
            encoding+=odd[i];
            encoding+=('-');
        }

        return encoding;

    }

}
