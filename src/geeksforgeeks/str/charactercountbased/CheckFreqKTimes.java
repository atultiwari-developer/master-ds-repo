package geeksforgeeks.str.charactercountbased;

public class CheckFreqKTimes {
    static int MAX_CHAR = 26;
    public static void main(String[] args) {
        String str = "aabbcc";
        int k = 2;
       int res = checkFreqMethod(str,k);
        System.out.println("the res is"+res);
    }

    private static int checkFreqMethod(String str, int k) {
        int res = 0;
        int n = str.length();
        for(int i = 0;i<str.length();i++){

            int[]arr = new int[MAX_CHAR];
            for(int j=i;j<n;j++){
                int charIndex = str.charAt(i)-'a';
                arr[charIndex]++;
                if(arr[charIndex]>k){
                    break;
                }
                else if(arr[charIndex]==k && freqCheck(arr,k)){

                    res++;
                }
            }
        }
       return res;

    }

    public static boolean freqCheck(int[]arr,int k){
        for(int i=0;i<MAX_CHAR;i++){
            if(arr[i] != 0 && arr[i]!=k){
                return false;
            }
        }
        return true;
    }


}

