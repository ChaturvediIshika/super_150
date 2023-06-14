package Advance_topics;

import java.util.ArrayList;
import java.util.Scanner;

public class Pattern_Find_Rabin_karp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0){
            String s1=sc.next();
            String s2=sc.next();
            sc.nextLine();
            RabinKarp(s1,s2);
        }
    }
    public static void RabinKarp(String s,String t){
        long mod=1000_000_007;
        long pow=1;
        long ans=0;
        int prime=31;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            ans=(ans+((ch-'a'+1)*pow)%mod)%mod;
            ans=(ans+mod)%mod;
            pow= (int) ((pow*prime)%mod);
        }
        //Rabin Karp
        //rolling Hash Technique
        long []dp=new long[s.length()+1];
        long []pa=new long[s.length()];
//        dp[0]=s.charAt(0)-'a'+1;
//        pa[0]=1;
        pow=prime;
        for (int i=0;i<pa.length;i++){
            dp[i+1]=(dp[i]+(s.charAt(i)-'a'+1)*pow%mod)%mod;
            pa[i]=pow;
            pow=(pow*prime)%mod;
        }
        ArrayList<Integer> ls=new ArrayList<>();

        for (int ei=t.length(),si=0;ei<=pa.length;ei++,si++){

            long hval=dp[ei]-dp[si];
            if(hval==ans*pa[si]%mod){
                ls.add(si+1);
            }
        }
        if(ls.size()==0)
            System.out.println("NOT FOUND");
        else {
            System.out.println(ls.size());
            for (int i:ls)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
