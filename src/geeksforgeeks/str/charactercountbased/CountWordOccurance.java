package geeksforgeeks.str.charactercountbased;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordOccurance {

    public static void main(String[] args) {
        String word[] = { "welcome", "to", "geeks", "portal"};
        String str = "geeksforgeeks is a computer science portal for geeks.";
        System.out.println(countOccurance(word,str));


    }

    public static int countOccurance(String[]words,String str){

        int count = 0;
        Pattern p= Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(str);
        Set<String> hs = new HashSet<String>();

        for(String word:words){
            hs.add(word);
        }

        while(m.find()){
            if(hs.contains(m.group())){
                count++;
            }
        }
        return count;
    }


}
