package Codeforces_Daily_Question;

import java.util.Scanner;

public class WonderfulColoring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int a[]=new int[26];
            for(int i=0;i<s.length();i++){
                a[s.charAt(i)-'a']++;
            }
            int one=0,two=0;
            for(int i=0;i<26;i++){
                if(a[i]==1)
                    one++;
                if(a[i]>=2)
                    two++;
            }
            if(one%2==0){
                System.out.println(one/2+two);
            }
            else
                System.out.println((one+1)/2+two-1);
        }
    }
}
