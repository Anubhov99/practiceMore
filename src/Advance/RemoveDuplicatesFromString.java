package Advance;

import java.util.*;

public class RemoveDuplicatesFromString {

    public static void stringWithoutDuplicate(String str){

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c : str.toCharArray()){
            set.add(c);
        }

        StringBuilder sc = new StringBuilder();

        for (char c : set){
            sc.append(c);
        }
        System.out.println(sc.toString());
    }
    public static void main(String[] args) {

       stringWithoutDuplicate("programming");
    }
}
