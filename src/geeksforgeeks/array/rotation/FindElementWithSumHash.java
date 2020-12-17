package geeksforgeeks.array.rotation;

import java.util.HashSet;

public class FindElementWithSumHash {

    public static void main(String[] args) {
        int[]arr = { 1, 4, 45, 6, 10, -8 };
         int sum = 16;
        printPairWithSum(arr,sum);

    }

    public static void printPairWithSum(int[]arr,int sum){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            int temp = sum-arr[i];
            if(hs.contains(temp)){
                System.out.println("the pair is"+arr[i]+","+temp);
            }
            else
                hs.add(arr[i]);
        }


    }

}
