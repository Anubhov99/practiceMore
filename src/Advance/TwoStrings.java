package Advance;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Problem: Given two strings, determine if they share a common substring (at least one common character).

Concept: Hashing / Set
*/
public class TwoStrings {

    static String twoStrings(String s1, String s2){
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        Set<Character> set = new HashSet<>();

        for(char c : c1){
            set.add(c);
        }

        for(char c : c2){
            if(set.contains(c)){
                return "Yes";
            }
        }
        return "No";
    }

    public static void main(String[] args) {

        System.out.println(twoStrings("labulu","bulu"));

    }
}
