package geeksforgeeks.str.charactercountbased;

public class StringWithKDisct {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        String res = findStringWithDistinctChar(n,k);
        System.out.println("the res is"+res);
    }

    public static String findStringWithDistinctChar(int n,int k){
        String res = "";
        for(int i=0;i<k;i++){
            res+=(char)('a'+i);
        }
        int count =0;

        for(int j=0;j<n-k;j++){
            res+=(char)('a'+count);
            count++;
            if(count==k){
                count=0;
            }
        }
        return res;
    }

}
