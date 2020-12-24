package geeksforgeeks.str.charactercountbased;

public class KthCharacterInDecryptStr {

    public static void main(String[] args) {
        String str="ab4c12ed3";
        int n = 21;
        String decrypt = decryptStr(str);
        System.out.println(decrypt.charAt(n-1));
    }

    public static String decryptStr(String str){

        String res="";
        int length = str.length();
        String subStr="";
        int freq =0;

        for(int i=0;i<length;){
            subStr="";
            freq = 0;
            while(i<length && str.charAt(i)>='a' && str.charAt(i)<='z'){
                subStr+=str.charAt(i);
                i++;
            }
            while(i<length && str.charAt(i)>='0' && str.charAt(i)<='9'){
                freq = freq*10 + str.charAt(i)-'0';
                i++;
            }
            for(int j=0;j<freq;j++){
              res+=subStr;
            }
        }



        return res;
    }

}
