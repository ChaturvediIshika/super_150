package DP_Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class Exchanging_Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        HashMap<Long,Long> map=new HashMap<Long,Long>();
        System.out.println(coins(n,map));
    }
    public static long coins(long n, HashMap<Long,Long> map){
        if(n==0)
            return 0;
        if(map.containsKey(n))
            return map.get(n);
        long ans=Math.max(n,coins(n/2,map)+coins(n/3,map)+coins(n/4,map));
        map.put(n,ans);
        return ans;
    }
}
