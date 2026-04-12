package Advance;


import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingString {
    static int longestNonRepeating(String str) {
        int right = 0;
        int left = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();


        while(right < str.length()) {



            if(set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }


            set.add(str.charAt(right));

            max = Math.max(max, (right-left)+1);

            right++;
        }
        return max;








    }




    public static void main(String[] args) {


        System.out.println(longestNonRepeating("abcabcbb"));



    }
}
