package Advance;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "silent";

        String str2 = "listen";


        if(str1==null || str2 ==null || str1.length()!=str2.length())
        {
            System.out.println("Not Anagram");
        }


        char[] a = str1.toCharArray();

        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            System.out.println("Words are Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}
