package geeksforgeeks.str.charactercountbased;

public class WindowWithAllChar {

    public static void main(String[] args) {
        String str = "thisisateststring";
        String pat = "tist";

        System.out.println(findWindow(str,pat));
    }

    public static String findWindow(String str,String pat){

        int len1 = str.length();
        int  len2= pat.length();


        if(len1<len2){
            System.out.println("no window exist");
        }
        int[]arr = new int[26];
        int[]brr = new int[26];

        for(int i=0;i<len2;i++){
            brr[pat.charAt(i)-'a']++;
        }
        int start =0;
        int start_index = -1;
        int min_len = Integer.MAX_VALUE;
        int count = 0;

        for(int j=0;j<len1;j++){
            arr[str.charAt(j)-'a']++;
            if(brr[str.charAt(j)-'a'] !=0 && arr[str.charAt(j)-'a']<=brr[str.charAt(j)-'a']){
                count++;
            }
            if(count==len2){

                while(arr[str.charAt(start)-'a']> brr[str.charAt(start)-'a'] ||brr[str.charAt(start)-'a']==0){
                    if(arr[str.charAt(start)-'a']> brr[str.charAt(start)-'a']){
                        arr[str.charAt(start)-'a']--;
                        start++;
                    }
                }

                int len_window = j-start+1;
                if(min_len>len_window){
                  min_len = len_window;
                  start_index = start;
                }


            }

        }
        if (start_index == -1)
        {
            System.out.println("No such window exists");
            return "";
        }
        return str.substring(start_index, start_index + min_len);

    }

}
