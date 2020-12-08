package geeksforgeeks.str.arithmetic;

import java.util.Collections;
import java.util.PriorityQueue;

public class RemoveKChar {

    public static void main(String[] args) {
        String str = "abbccc";
        int k = 2;

    }

    public int processStr(String str,int k){
        int[]arr = new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<26;i++){
            pq.add(arr[i]);
        }

        while(k !=0){
            pq.add(pq.poll()-1);
            k--;
        }
      int sum = 0;
        while(!pq.isEmpty()){
            sum = pq.peek()*pq.poll();
        }
        return sum;
    }

}
