package Advance;
/*
Problem Statement

A sock merchant has a pile of socks where each sock is represented by an integer indicating its color.
Given an array of integers representing the colors of the socks, determine how many matching pairs of socks there are.
Two socks form a pair if they have the same color.
Input :
1. An integer n — the total number of socks.
2. An array ar of size n where each element represents the color of a sock.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SockPair {

    // using stream api (Java 8)
    static int sockMerchant(int[] ar) {
        return Arrays.stream(ar)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .mapToInt(c -> (int)(c / 2))
                .sum();
    }

    static int pairOfSocks(int num1, int[] num2){

        Set<Integer> set = new HashSet<>();
        int pair = 0;
        for(int sock : num2){
            if(!set.contains(sock)){
                set.add(sock);
            }else{
                pair++;
                set.remove(sock);
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        System.out.println(pairOfSocks(1,new int[]{1,2,1}));

    }
}
