package geeksforgeeks.array.rearrange;

public class RearrangePosNeg {

    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
        reArrangeMethod(arr,n);
        printArr(arr);
    }
    public static void reArrangeMethod(int[]arr,int n){
        int temp=0;
        int j=-1;

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                j++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int pos = j+1;
        int neg = 0;
        while(pos<n && neg<pos && arr[neg]<0){
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg+=2;
        }


    }
    private static void printArr(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
