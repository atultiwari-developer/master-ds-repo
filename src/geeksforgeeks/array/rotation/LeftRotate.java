package geeksforgeeks.array.rotation;

public class LeftRotate {

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 6;
        leftRotate(arr,n,d);
        for(int x=0;x<n;x++){
            System.out.print(arr[x]+" ");
        }
    }

    public static void leftRotate(int[]arr,int n,int d){
       if(d==0)
           return;
       if(d>n)
           d = n%d;
       reverseArr(arr,0,d-1);
        reverseArr(arr,d,n-1);
        reverseArr(arr,0,n-1);

    }

    private static void reverseArr(int[] arr, int start, int end) {

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
