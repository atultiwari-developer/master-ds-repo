package interview;

import java.util.HashSet;

public class MyTest {

    public static void main(String[] args) {
        //int[]{1,1,1,1,1,2,1,1,1,2,2} find all pairs whose sum is 2
        int[]arr = {1,1,1,1,1,2,1,1,1,2,2};
        int n = arr.length;
        int k = 3;
        System.out.println(printPairs(arr,n,k));

    }

    public static int printPairs(int []arr,int n,int k){
        HashSet<Integer> hs = new HashSet<>();
        int temp = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            temp = k-arr[i];
            if (hs.contains(temp)) {
                count++;
            }
            else{
                if(temp !=0)
                hs.add(temp);
            }
        }
        return count;
    }
}
