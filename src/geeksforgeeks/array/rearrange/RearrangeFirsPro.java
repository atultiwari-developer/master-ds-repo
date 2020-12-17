package geeksforgeeks.array.rearrange;

import java.util.HashSet;
import java.util.Set;
//https://www.geeksforgeeks.org/rearrange-array-arri/
public class RearrangeFirsPro {
    public static void main(String[] args) {
        int arr[] = { -1, -1, 6, 1, 9,
                3, 2, -1, 4, -1 };

        int n = arr.length;
        fixArray(arr,n);
        fixArrUsingHahsSet(arr,n);

    }

    public static void fixArray(int[]arr,int n){
        int i,j,temp;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(arr[j]==i){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        for(i=0;i<n;i++){
            if(arr[i] !=i){
                arr[i] = -1;
            }
        }
        for(int x=0;x<n;x++){
            System.out.print(arr[x]+" ");
        }


    }

    public static void fixArrUsingHahsSet(int[]arr,int n){
        Set<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            if(hs.contains(i)){
                arr[i] = i;
            }
            else
                arr[i]= -1;
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }

}
