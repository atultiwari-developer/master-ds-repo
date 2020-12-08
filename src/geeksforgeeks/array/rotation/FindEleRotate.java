package geeksforgeeks.array.rotation;

public class FindEleRotate {

    public static void main(String[] args) {
        int[]arr = {3,4,5,1,2};
        int n = arr.length;


    }

    public int findPivot(int[]arr,int low,int high){

        if(high <low){
            return -1;
        }
        if(high==low)
            return low;
        int mid = (high+low)/2;
        if(mid<high && arr[mid]>arr[mid+1]){
           return mid;
        }
        if(mid>low && arr[mid]<arr[mid-1]){
            return mid-1;
        }
        if(arr[low]>=arr[mid]){
            return findPivot(arr,low,mid-1);
        }

        return findPivot(arr,mid+1,high);
    }
    public int pivotBinarysearch(int[]arr,int n,int key){
        int pivot = findPivot(arr,0,n-1);
        if(pivot==-1){
            return search(arr,0,n-1,key);
        }
        if(arr[pivot]==key){
            return pivot;
        }
        if(arr[pivot]<=key){
            return search(arr,0,pivot-1,key);
        }
        return search(arr,pivot+1,n-1,key);
    }

    private int search(int[] arr, int high, int low, int key) {
        if(high<low)
            return -1;
        int mid = (high+low)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
            return search(arr,low,mid-1,key);
        }
        return search(arr,mid+1,high,key);
    }
}
