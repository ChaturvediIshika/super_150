package Codeforces_Daily_Question;

import java.util.Scanner;

public class ICPCBalloons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String str= sc.next();
            int a[]=new int[26];
            for(int i=0;i<n;i++){
                if(a[str.charAt(i)-'A']==0)
                    a[str.charAt(i)-'A']=2;
                else
                    a[str.charAt(i)-'A']++;
            }
            int b=0;
            for (int i=0;i<26;i++)
                b+=a[i];
            System.out.println(b);
        }
    }
}
