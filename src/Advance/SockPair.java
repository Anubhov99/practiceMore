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

import java.util.HashSet;
import java.util.Set;

public class SockPair {

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
