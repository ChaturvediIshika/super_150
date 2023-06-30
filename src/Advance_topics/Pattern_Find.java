package Advance_topics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pattern_Find {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String hay=sc.next();
            String needle=sc.next();
            String str=needle+"#"+hay;
            List<Integer> ls=lsp(str,needle.length());
            if(ls.size()==0){
                System.out.println("Not Found");
                System.out.println();
                continue;
            }
            System.out.println(ls.size());
            for(int i:ls)
                System.out.print(i+1+" ");
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
