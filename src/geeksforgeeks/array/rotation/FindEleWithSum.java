package geeksforgeeks.array.rotation;

import java.util.Arrays;

public class FindEleWithSum {

    public static void main(String[] args) {
        int[]arr = { 1, 4, 45, 6, 10, -8 };
        int sum = 16;
        sumExist(arr,sum);
        System.out.println("the sum is"+sumExist(arr,sum));
    }
    public static boolean sumExist(int[]arr,int sum){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            if((arr[left]+arr[right])==sum)
                return true;
            else if((arr[left]+arr[right]<sum)){
              left++;
            }
            else
                right--;
        }
        return false;
    }
}
