package Codeforces_Daily_Question;

import java.util.HashMap;
import java.util.Scanner;

public class Football123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer> map=new HashMap<>();
        while (n-->0){
            String s=sc.next();
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String ans="";
        int max=0;
        for (String t:map.keySet())
        {
            if(map.get(t)>max){
                ans=t;
                max=map.get(t);
            }
        }
        System.out.println(ans);
    }
}
