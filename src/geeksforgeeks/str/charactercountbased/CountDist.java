package geeksforgeeks.str.charactercountbased;

import java.util.Arrays;

public class CountDist {

    public static void main(String[] args) {
        String str = "abcbaa";
        int k = 3;
        int res = countDistSubStr(str,k);
        System.out.println("the res is"+res);
    }

    public static int countDistSubStr(String str,int k){
        int res = 0;
        int n = str.length();
        int []count = new int[26];
        for(int i=0;i<n;i++){
            int dist_count = 0;
            Arrays.fill(count,0);
            for(int j=i;j<n;j++){
                if(count[str.charAt(j)-'a']==0){
                    dist_count++;
                }
                count[str.charAt(j)-'a']++;
                if(dist_count==k){
                    res++;
                }
            }
        }

        return res;
    }
}
