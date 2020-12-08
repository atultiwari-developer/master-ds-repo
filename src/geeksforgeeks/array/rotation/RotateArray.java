package geeksforgeeks.array.rotation;

public class RotateArray {

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int k = 2;
        System.out.println("the array after rotation ");
        int n = arr.length;
        rotateArray(arr,n,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void rotateArray(int[]arr,int n,int k){

        for(int i=0;i<k;i++){
            int temp  = arr[0];
            for(int j = 0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }

    }

    public static  void swap(int[]arr,int i,int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
