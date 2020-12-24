package geeksforgeeks.str.charactercountbased;

public class CharCount {

    static final int OUT = 0;
    static final int IN = 1;
    public static void main(String[] args) {
        String str = "One two       three\n four\tfive  ";
        int x = countWords(str);
        System.out.println("the value of x"+x);

    }

    public static int countWords(String str){
        int state = OUT;
        int wordCount = 0;
        int i=0;
        int n = str.length();
        while(i<n){
            if(str.charAt(i)==' ' || str.charAt(i)=='\n' || str.charAt(i)=='\t'){
                state = OUT;
            }
            else if(state==OUT){
                state = IN;
                ++wordCount;
            }
            i++;
        }
        return wordCount;
    }
}
