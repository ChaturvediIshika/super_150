package Advance_topics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_Needle_in_the_Haystack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            String needle=sc.next();
            String hay=sc.next();
            String str=needle+"#"+hay;
            List<Integer> ls=lsp(str,n);
            for(int i:ls)
                System.out.println(i);
            System.out.println();
        }
    }
    public static List<Integer> lsp(String s,int n){
        int dp[]=new int[s.length()];
        List<Integer> ls=new ArrayList<>();
        int l=0;
        for (int i=1;i<s.length();){
            if(s.charAt(l)==s.charAt(i)){
                l++;
                dp[i]=l;
                if(dp[i]==n)
                    ls.add(i-2*n);
                i++;
            }
            else{
                if(l>0){
                    l=dp[l-1];
                }
                else{
                    dp[i]=0;
                    i++;
                }
            }
        }
        return ls;
    }
}
