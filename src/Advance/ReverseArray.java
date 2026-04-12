package Advance;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {


    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here

        List<Integer> rev = new ArrayList<>();

        for(int i = a.size()-1; i>=0;i--){
            rev.add(a.get(i));
        }

        return rev;

    }


    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(reverseArray(a));
    }
}
