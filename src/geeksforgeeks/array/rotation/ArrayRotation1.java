package geeksforgeeks.array.rotation;

public class ArrayRotation1 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 2;
        rotateArr(arr,n,d);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void rotateArr(int[]arr,int n,int d){
        int[]temp = new int[d];
        int count = d;
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        while(count-->0){
            for(int j=0;j<n-1;j++){
                arr[j] = arr[j+1];
            }

        }
        int x = 0;
        for(int i=n-d;i<n;i++){
            arr[i] = temp[x];
            x = x+1;
        }

    }
}
