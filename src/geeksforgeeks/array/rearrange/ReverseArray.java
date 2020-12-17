package geeksforgeeks.array.rearrange;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3};
       // reverseArrMethod(arr);
        revereArrRecursion(arr,0,arr.length-1);
        printArr(arr);
    }

    private static void reverseArrMethod(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left != right){
            swap(arr,left,right);
            left++;
            right--;
        }
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void revereArrRecursion(int[]arr,int left,int right){
        int temp;
        if(left>=right)
            return;
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        revereArrRecursion(arr,left+1,right-1);
    }

}
