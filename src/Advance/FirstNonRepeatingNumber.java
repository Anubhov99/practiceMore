package Advance;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingNumber {
    static Character findFirstNonRepeated(String s){
        Map<Character,Integer> freq = new LinkedHashMap<>();;
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> q : freq.entrySet())
        {
            if(q.getValue()==1) return q.getKey();
        }
        return null;
    }
    public static void main(String[] args) {

        System.out.println(FirstNonRepeatingNumber.findFirstNonRepeated("Swiss"));

    }
}
