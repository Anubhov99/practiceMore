package Advance;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        System.out.println("Enter here vvvv");
        Scanner sc =  new Scanner(System.in);

        String str1 = sc.nextLine();

        String str2 = sc.nextLine();


        if(str1.equals(str2)|| str1.length()!=str2.length())
        {
            System.out.println("Not Anagram");
            return;
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
