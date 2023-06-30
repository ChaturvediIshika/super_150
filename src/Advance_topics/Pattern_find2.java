package Advance_topics;


import java.util.*;
import java.lang.*;

class Pattern_find2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String hay=sc.next();
            String needle=sc.next();
            String s=needle+"#"+hay;
            int n=needle.length();
            int dp[]=new int[s.length()];
            List<Integer> ls=new ArrayList<>();
            int l=0;
            for (int i=1;i<s.length();){
                if(s.charAt(l)==s.charAt(i)){
                    l++;
                    dp[i]=l;
                    if(l==n)
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
            if(ls.size()==0){
                System.out.println("Not Found");
            }
            else{
                System.out.println(ls.size());
                for(int i:ls)
                    System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }

}