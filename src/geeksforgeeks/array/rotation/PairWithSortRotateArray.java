package geeksforgeeks.array.rotation;

public class PairWithSortRotateArray {

    public static void main(String[] args) {
        int[]arr = {11,15,6,8,9,10};
        int sum = 16;
        if(pairExist(arr,sum)){
            System.out.println("pair exist");
        }
        else
            System.out.println("pair does not exist");
    }

    public static boolean pairExist(int[]arr,int n){
        int i;
        int length = arr.length;
        for(i=0;i<length-1;i++){
            if(arr[i]>arr[i+1])
                break;
        }
        int left = (i+1)%n;
        int right = i;
        while(left != right){
            if((arr[left]+arr[right])==n){
                return true;
            }
            if((arr[left]+arr[right])<n){
                left = (left+1)%n;
            }
            else
                right = (length+right-1)%length;
        }


        return false;
    }
}
